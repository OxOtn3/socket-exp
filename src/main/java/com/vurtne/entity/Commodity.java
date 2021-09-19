package com.vurtne.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author vurtne
 * @since 2021-09-09
 */
@Data
@EqualsAndHashCode
@TableName("commodity")
public class Commodity{

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private Integer price;

    /**
     * 商品库存
     */
    private Integer stock;

    /**
     * 对商品的描述
     */
    private String description;

    /**
     * 商品图片id
     */
    private String imageId;


}
