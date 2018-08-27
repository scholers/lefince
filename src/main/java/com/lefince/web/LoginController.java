package com.lefince.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lefince.entity.Account;
import com.lefince.service.AccountService;
import com.lefince.util.WXAppletUserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 登录服务入口
 * code:loginRes.code,//临时登录凭证
 *     rawData:infoRes.rawData,//用户非敏感信息
 *     signature:infoRes.signature,//签名
 *     encrypteData:infoRes.encryptedData,//用户敏感信息
 *     iv:infoRes.iv//解密算法的向量
 */
public class LoginController {
         Logger log = LoggerFactory.getLogger(WXAppletUserInfo.class);

        @Autowired
        private AccountService accountService;

        /**
         * 列表查询
         * @return
         */
        @RequestMapping(value = "/login",method = RequestMethod.GET)
        private Map<String, Object> login(String appid, String secret,String js_code,String grant_type) {
            Map<String, Object> modelMap = new HashMap<String, Object>();
            // TODO: 2018/8/22
            //List<Finace> areas = finaceService.queryFinace(userId);
            //modelMap.put("areaList", areas);
            //WXAppletUserInfo.getSessionKeyOropenid();
            return modelMap;
        }


    public Map<String,Object> doLogin(
                                      @RequestParam(value = "code",required = false) String code,
                                      @RequestParam(value = "rawData",required = false) String rawData,
                                      @RequestParam(value = "signature",required = false) String signature,
                                      @RequestParam(value = "encrypteData",required = false) String encrypteData,
                                      @RequestParam(value = "iv",required = false) String iv){
        log.info( "Start get SessionKey" );


        Map<String,Object> map = new HashMap<String, Object>(  );
        System.out.println("用户非敏感信息"+rawData);

        JSONObject rawDataJson = JSON.parseObject( rawData );

        System.out.println("签名"+signature);
        JSONObject SessionKeyOpenId = WXAppletUserInfo.getSessionKeyOropenid( code );
        System.out.println("post请求获取的SessionAndopenId="+SessionKeyOpenId);

        String openid = SessionKeyOpenId.getString("openid" );

        String sessionKey = SessionKeyOpenId.getString( "session_key" );

        System.out.println("openid="+openid+",session_key="+sessionKey);

        Account account = accountService.queryAccountByOpId(openid);
        //uuid生成唯一key
        String skey = UUID.randomUUID().toString();
        if(account == null){
            //入库
            String nickName = rawDataJson.getString( "nickName" );
            String avatarUrl = rawDataJson.getString( "avatarUrl" );
            String gender  = rawDataJson.getString( "gender" );
            String city = rawDataJson.getString( "city" );
            String country = rawDataJson.getString( "country" );
            String province = rawDataJson.getString( "province" );

            /*

            user = new User();
            user.setUid( openid );
            user.setCreateTime( new Date(  ) );
            user.setSessionkey( sessionKey );
            user.setUbalance( 0 );
            user.setSkey( skey );
            user.setUaddress( country+" "+province+" "+city );
            user.setUavatar( avatarUrl );
            user.setUgender( Integer.parseInt( gender ) );
            user.setUname( nickName );
            user.setUpdateTime( new Date(  ) );

            userService.insert( user );
            */
        }else {
            //已存在
            log.info( "用户openid已存在,不需要插入" );
        }
        //根据openid查询skey是否存在
         /*
        String skey_redis = (String) redisTemplate.opsForValue().get( openid );
        if(StringUtils.isNotBlank( skey_redis )){
            //存在 删除 skey 重新生成skey 将skey返回
            redisTemplate.delete( skey_redis );

        }
        //  缓存一份新的

        JSONObject sessionObj = new JSONObject(  );
        sessionObj.put( "openId",openid );
        sessionObj.put( "sessionKey",sessionKey );
        redisTemplate.opsForValue().set( skey,sessionObj.toJSONString() );
        redisTemplate.opsForValue().set( openid,skey );
        */

        //把新的sessionKey和oppenid返回给小程序
        map.put( "skey",skey );

        map.put( "result","0" );


        JSONObject userInfo = null;//getUserInfo( encrypteData, sessionKey, iv );
        System.out.println("根据解密算法获取的userInfo="+userInfo);
        //userInfo.put( "balance",user.getUbalance() );
        map.put( "userInfo",userInfo );

        return map;
    }


}
