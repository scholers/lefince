package com.lefince.web;

import com.lefince.entity.Finace;
import com.lefince.service.FinaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinaceController {

    @Autowired
    private FinaceService finaceService;

    /**
     * 列表查询
     * @return
     */
    @RequestMapping(value = "/querymoney",method = RequestMethod.GET)
    private Map<String, Object> listFinace(Integer userId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Finace> areas = finaceService.queryFinace(userId);
        modelMap.put("areaList", areas);
        return modelMap;
    }

    /**
     * finaceId 查询
     * @param finaceId
     * @return
     */
    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String, Object> getFinaceById(Integer finaceId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Finace finace = finaceService.selectByPrimaryKey(finaceId);
        modelMap.put("finace", finace);
        return modelMap;
    }

    /**
     * 添加finace
     * @param finace
     * @return
     */
    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody Finace finace) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        boolean isSuccess = finaceService.insert(finace);
        modelMap.put("success", isSuccess);
        return modelMap;
    }

    /**
     * 修改
     * @param finace
     * @return
     */
    @RequestMapping(value = "/editmoney",method = RequestMethod.POST)
    private Map<String, Object> modifyFinace(@RequestBody Finace finace) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        boolean b = finaceService.updateByPrimaryKeySelective(finace);
        modelMap.put("success", b);
        return modelMap;
    }


    /**
     * 删除finace
     * @param finaceId
     * @return
     */
    @RequestMapping(value = "/delmoney",method = RequestMethod.GET)
    private Map<String, Object> removeFinace(Integer finaceId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        boolean isSuccess = finaceService.deleteByPrimaryKey(finaceId);
        modelMap.put("success", isSuccess);
        return modelMap;
    }
}
