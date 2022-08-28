package com.spring.using.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 二院临时使用检验段对应的编码
 * @author 砒霜
 */
@Getter
@AllArgsConstructor
public enum ExecutiveDepartmentEnum {
    ABL("ABL","3087"),
    ACL("ACL","3087"),
    BKM("BKM","3087"),
    BWF("BWF","3087"),
    DXI("DXI","3082"),
    FUS("FUS","3087"),
    FXG("FXG","3087"),
    HAC("HAC","3087"),
    JXG("JXG","3087"),
    KHS("KHS","3087"),
    KUF("KUF","3087"),
    MAG("MAG","3082"),
    MRX("MRX","3087"),
    MXG("MXG","3087"),
    NCG("NCG","3087"),
    NIQ("NIQ","3087"),
    SAU("SAU","3081"),
    SHA("SHA","3081"),
    WSA("WSA","3090"),
    XBC("XBC","3087"),
    XCG("XCG","3087"),
    XNY("XNY","3087"),
    CRP("CRP","3087"),
    DBC("DBC","3087"),
    ETH("ETH","3081"),
    HXD("HXD","3087"),
    JCX("JCX","3087"),
    MRS("MRS","3081"),
    MYS("MYS","3086"),
    TTT("TTT","3087"),
    WSB("WSB","3090"),
    XJY("XJY","3084"),
    XXG("XXG","3085"),
    ZLC("ZLC","3087");


    private final String JYD;
    private final String CODE;

    public static final Map<String ,String> map = new HashMap<>();


    static {
        for (ExecutiveDepartmentEnum data :ExecutiveDepartmentEnum.values()) {
            map.put(data.getJYD(),data.getCODE());
        }
    }


}
