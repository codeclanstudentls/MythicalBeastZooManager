package com.example.user.mythicalbeastszoomanager;

/**
 * Created by user on 19/12/2016.
 */
public class WalkingMonster extends Animal implements Mammalable{

    public WalkingMonster(String name, String species, int age, double food_level) {
        super(name, species, age, food_level);
    }

    public String walk(){
        return "Stomp, clomp tread on your toes ";
    }

}
