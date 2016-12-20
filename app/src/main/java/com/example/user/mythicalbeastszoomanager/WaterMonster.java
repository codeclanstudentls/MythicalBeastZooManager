package com.example.user.mythicalbeastszoomanager;

/**
 * Created by user on 19/12/2016.
 */
public class WaterMonster extends Animal implements Swimmable {

    public WaterMonster(String name, String species, int age, double food_level){
        super(name, species, age, food_level);

    }

    public String swim(){
        return "Splish splash swimmy-swim-swim";
    }


}

