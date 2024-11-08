package com.curso_ds.pedidos.entities;


public class Order {
    private Integer code;
    private Double baseVal;
    private  Double discount;

    public Order(){}

    public Order(Integer code, Double baseVal, Double discount) {
        this.code = code;
        this.baseVal = baseVal;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBaseVal() {
        return baseVal;
    }

    public void setBaseVal(Double baseVal) {
        this.baseVal = baseVal;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
