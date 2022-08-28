package com.spring.using.test;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class QcItemResults implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 机构id
     */
    @ApiModelProperty(value = "机构id")
    private Long orgId;

    /**
     * 组织机构代码
     */
    @ApiModelProperty(value = "组织机构代码")
    private String orgCode;

    /**
     * 区域代码
     */
    @ApiModelProperty(value = "区域代码")
    private String areaCode;

    /**
     * 质控品批号
     */
    @ApiModelProperty(value = "质控品批号")
    private String contralCode;

    /**
     * 质控品名称
     */
    @ApiModelProperty(value = "质控品名称")
    private String contralName;

    /**
     * 质控水平
     */
    @ApiModelProperty(value = "质控水平")
    private String contralLevel;

    /**
     * 项目代码
     */
    @ApiModelProperty(value = "项目代码")
    private String itemCode;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String itemName;

    /**
     * 排序号
     */
    @ApiModelProperty(value = "排序号")
    private String displaySort;

    /**
     * 结果
     */
    @ApiModelProperty(value = "结果")
    private String itemResult;

    /**
     * 结果时间
     */
    @ApiModelProperty(value = "结果时间")
    private Date itemTime;

    /**
     * Z分值
     */
    @ApiModelProperty(value = "Z分值")
    private Float zValue;

    /**
     * 质控状态(0在控1失控)
     */
    @ApiModelProperty(value = "质控状态(0在控1失控)")
    private Integer resultState;

    /**
     * 失控规则
     */
    @ApiModelProperty(value = "失控规则")
    private String qcRule;

    /**
     * 仪器名称
     */
    @ApiModelProperty(value = "仪器名称")
    private String instrumentName;

    /**
     * 专业组
     */
    @ApiModelProperty(value = "专业组")
    private String labGroup;

    /**
     * 实验室
     */
    @ApiModelProperty(value = "实验室")
    private String labCode;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Long creatorId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private Long updaterId;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 预留字段
     */
    @ApiModelProperty(value = "预留字段")
    private Object jsonb;

    /**
     * 删除标志
     */
    @ApiModelProperty(value = "删除标志")
    private Integer isDel;

    /**
     * 仪器编码
     */
    @ApiModelProperty(value = "仪器编码")
    private String instrumentCode;

    /**
     * 质控结果 0通过，1未通过
     */
    @ApiModelProperty(value = "质控结果 0通过，1未通过")
    private Integer contralResult;

    @ApiModelProperty(value = "样本号")
    private String inspectionNo;

}
