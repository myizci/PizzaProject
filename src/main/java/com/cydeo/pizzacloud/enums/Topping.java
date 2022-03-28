package com.cydeo.pizzacloud.enums;

public enum Topping {

    MUSHROOMS("Mushrooms"), JALAPENOS("Jalapenos"), ONIONS("Onions"), RED_PEPPERS("Red_Peppers"), TOMATOES("Tomatoes");

    private final String value;

    Topping(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
