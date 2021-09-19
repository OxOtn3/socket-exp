package com.vurtne.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vurtne.entity.Commodity;
import com.vurtne.mapper.CommodityMapper;
import com.vurtne.service.ICommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author vurtne
 * @since 2021-09-09
 */
@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements ICommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    /**
     * 添加商品
     * @param commodity
     * @return
     */
    @Override
    public int addCommodity(Commodity commodity) {
        return commodityMapper.insert(commodity);
    }

    /**
     * 删除商品
     * @return
     */
    @Override
    public int deleteCommodityById(Integer id) {
        return commodityMapper.deleteById(id);
    }

    /**
     * 修改商品
     * @param commodity
     * @return
     */
    @Override
    public int updateCommodityById(Commodity commodity) {
        return commodityMapper.updateById(commodity);
    }

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @Override
    public Commodity getCommodityById(Integer id) {
        return commodityMapper.selectById(id);
    }

    /**
     * 模糊查询
     * @param wrapper
     * @return
     */
    @Override
    public List<Commodity> getCommodityMap(QueryWrapper<Commodity> wrapper) {
        return commodityMapper.selectList(wrapper);
    }




    @Override
    public List<Commodity> showAll() {
        return commodityMapper.selectList(null);
    }
}
