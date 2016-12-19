package com.example.user.mythicalbeastszoomanager;

/**
 * Created by user on 19/12/2016.
 */
public class FlyingMonster extends Animal implements Flyable{

    public FlyingMonster(String name, String species, int age, double food_level){
        super(name, species, age, food_level);

    }

    public String fly(){
        return "Swoop, soar and poo on you from great heights";
    }



}