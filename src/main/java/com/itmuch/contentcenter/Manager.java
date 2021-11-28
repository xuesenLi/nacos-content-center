package com.itmuch.contentcenter;

import lombok.Data;

import java.util.Date;

@Data
public class Manager {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 店铺id
     */
    private Long shopId;

    private String shopUniId;

    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 负责人id
     */
    private Long managerId;
    /**
     * 分组id
     */
    private Long managerGroupId;
    /**
     * 商品id
     */
    private Long itemId;
    private String itemIds;
    /**
     * 商品图片url
     */
    private String itemPicUrl;
    /**
     * 商品名称
     */
    private String itemName;
    /**
     * 商品价格
     */
    private Double itemPrice;
    /**
     * enable_status
     */
    private Long enableStatus;
    /**
     * modified
     */
    private Date modified;

    private String onSaleName;


}
