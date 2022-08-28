package com.spring.using.test;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 砒霜
 */
@Data
public class QueryDataByRequisitionIdVO {

    @ApiModelProperty(value = "医生医嘱ID")
    private Long orderId;

    @ApiModelProperty(value = "条码")
    private String barcode;

    @ApiModelProperty(value = "申请单ID")
    private Long requisitionId;

    @ApiModelProperty(value = "检验目的Code")
    private String medicalItemCode;

    @ApiModelProperty(value = "医嘱项目id", required = true)
    private Long orderItemId;

    @ApiModelProperty(value = "单个检验目的金额", required = false)
    private BigDecimal itemAmount;

    @ApiModelProperty(value = "金额", required = false)
    private BigDecimal amount = BigDecimal.valueOf(0);

    class item{
        private String re;
        private String ch;
    }

}
