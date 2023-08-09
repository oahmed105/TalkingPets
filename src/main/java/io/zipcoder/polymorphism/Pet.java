package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet extends ArrayList {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {

    }

}
