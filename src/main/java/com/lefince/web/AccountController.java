package com.lefince.web;

import com.lefince.entity.Account;
import com.lefince.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lefince on 2018/3/16.
 */
@RestController
@RequestMapping("/superadmin")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 列表查询
     * @return
     */
    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        /*
        List<Account> areas = accountService.queryArea();
        */
       // modelMap.put("areaList", areas);
        return modelMap;
    }

    /**
     * areaid 查询
     * @param areaId
     * @return
     */
    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String, Object> getAreaById(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Account area = accountService.selectByPrimaryKey(areaId);
        modelMap.put("area", area);
        return modelMap;
    }

    /**
     * 添加account
     * @param account
     * @return
     */
    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody Account account) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        boolean isSuccess = accountService.insert(account);
        modelMap.put("success", isSuccess);
        return modelMap;
    }

    /**
     * 修改
     * @param account
     * @return
     */
    @RequestMapping(value = "/modifyarea",method = RequestMethod.POST)
    private Map<String, Object> modifyArea(@RequestBody Account account) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        boolean b = accountService.updateByPrimaryKeySelective(account);
        modelMap.put("success", b);
        return modelMap;
    }


    /**
     * 删除area
     * @param areaId
     * @return
     */
    /*
    @RequestMapping(value = "/removearea",method = RequestMethod.GET)
    private Map<String, Object> removeArea(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        boolean isSuccess = accountService.deleteByPrimaryKey(areaId);
        modelMap.put("success", isSuccess);
        return modelMap;
    }*/
}
