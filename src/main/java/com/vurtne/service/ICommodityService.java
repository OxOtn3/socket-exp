package com.vurtne.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vurtne.entity.Commodity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.vurtne.entity.Commodity;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author vurtne
 * @since 2021-09-09
 */
public interface ICommodityService extends IService<Commodity> {

    int addCommodity(Commodity commodity);

    int deleteCommodityById(Integer id);

    int updateCommodityById(Commodity commodity);

    Commodity getCommodityById(Integer id);

    List<Commodity> getCommodityMap(QueryWrapper<Commodity> wrapper);

    List<Commodity> showAll();

}
