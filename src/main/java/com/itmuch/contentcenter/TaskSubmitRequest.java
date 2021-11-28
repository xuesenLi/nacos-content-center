package com.itmuch.contentcenter;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class TaskSubmitRequest implements Serializable {

    /**
     * 店铺ID
     */
    private String shopUniId;

    /**
     * 数据类型：
     * trade
     * order
     * refund
     * item
     * kuaiche
     * alipay
     * erp
     * adshow
     * tuijian
     * pdd
     * alipayztc
     */
    private String dataType;

    /**
     * 时间范围：[0] 开始时间，[1] 结束时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date[] dateRange;

}
