package com.vurtne.controller;


import com.vurtne.entity.Commodity;
import com.vurtne.mapper.CommodityMapper;
import com.vurtne.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author vurtne
 * @since 2021-09-09
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController{

    @Autowired
    ICommodityService iCommodityService;

    @PostMapping("/add")
    public Object testAdd(Commodity commodity){
        return iCommodityService.addCommodity(commodity);
    }

    @GetMapping("/showAll")
    public Object showAll(){
        return iCommodityService.showAll();
    }
}
