package com.taikang.springbootdemo.domain;

import com.taikang.springbootdemo.validCheck.ValidCardNumber;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class User {
    @Max(100)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    @ValidCardNumber(message = "卡号格式有误")
    private String cardNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
