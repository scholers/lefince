package com.lefince.web;

import com.lefince.service.FinaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

public class LoginController {

        @Autowired
        private FinaceService finaceService;

        /**
         * 列表查询
         * @return
         */
        @RequestMapping(value = "/querymoney",method = RequestMethod.GET)
        private Map<String, Object> login(String appid, String secret,String js_code,String grant_type) {
            Map<String, Object> modelMap = new HashMap<String, Object>();
            // TODO: 2018/8/22
            //List<Finace> areas = finaceService.queryFinace(userId);
            //modelMap.put("areaList", areas);
            return modelMap;
        }


}
