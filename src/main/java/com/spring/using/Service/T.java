package com.spring.using.Service;


import org.apache.commons.lang.StringUtils;
import org.hsqldb.lib.StringUtil;

import javax.sound.midi.Track;
import java.math.BigDecimal;

public class T {
    public static void main(String[] args) {
        BigDecimal it = BigDecimal.valueOf(1.00);
        BigDecimal data = BigDecimal.valueOf(12.00);
        BigDecimal amountMoney = BigDecimal.valueOf(0.00);
        System.out.println(amountMoney.add(it.multiply(data)));
//        Thread()
    }
}
