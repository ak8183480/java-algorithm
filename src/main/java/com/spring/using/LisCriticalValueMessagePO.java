package com.spring.using;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.List;

/**
 * @author 砒霜
 */
@Data
@ApiModel(value = "危急值发短信入参")
public class LisCriticalValueMessagePO {

    @ApiModelProperty(value = "流水号")
    private String orgMesId;

    @ApiModelProperty(value = "手机号码")
    private String telNumber;

    @ApiModelProperty(value = "短信发起用户")
    private String sendName;

    @ApiModelProperty(value = "医生姓名")
    private String dockerName;

    @ApiModelProperty(value = "患者姓名")
    private String patientName;

    @ApiModelProperty(value = "患者门诊号")
    private String archivesId;

    @ApiModelProperty(value = "患者电话")
    private String patientTelNumber;

    @ApiModelProperty(value = "危急值项目")
    private List<CriticalValueItemsList> item;

    /**
     * 危急值项目列表
     */
    @Data
    public class CriticalValueItemsList{

        @ApiModelProperty(value = "检验项目名称")
        private String itemsName;

        @ApiModelProperty(value = "检验结果")
        private String result;

        @ApiModelProperty(value = "参考范围")
        private String referenceRange;

        @ApiModelProperty(value = "单位")
        private String unit;

    }

}
