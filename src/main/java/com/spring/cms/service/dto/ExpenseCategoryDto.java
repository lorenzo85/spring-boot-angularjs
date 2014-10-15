package com.spring.cms.service.dto;

public class ExpenseCategoryDto {

    public String value;
    public String name;

    public ExpenseCategoryDto(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
