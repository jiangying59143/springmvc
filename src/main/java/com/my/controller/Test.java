package com.my.controller;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal rate = new BigDecimal(String.valueOf(59.999999))
                .subtract(new BigDecimal(30))
                .multiply(new BigDecimal(100))
                .divide(new BigDecimal(30), 3, BigDecimal.ROUND_DOWN);
        System.out.println(rate);
    }
}
