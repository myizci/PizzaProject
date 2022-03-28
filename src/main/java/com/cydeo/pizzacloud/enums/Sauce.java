package com.cydeo.pizzacloud.enums;

public enum Sauce {

    TOMATO_SAUCE("Tomato_Sauce"), PEPPERY_RED_SAUCE("Peppery_Red_Sauce"), SWEET_PIZZA_SAUCE("Sweet_Pizza_Sauce");

    private final String value;

    Sauce(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
