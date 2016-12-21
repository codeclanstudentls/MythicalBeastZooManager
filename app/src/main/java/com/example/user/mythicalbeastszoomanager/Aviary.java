package com.example.user.mythicalbeastszoomanager;
import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */

public class Aviary extends Enclosure {
    private ArrayList<Flyable> animals;

    public Aviary(String name){
        super(name);
        animals = new ArrayList<Flyable>();
    }

    public void addFlyableToAviary(Flyable flyingMonster){
        animals.add(flyingMonster);
    }

    public void removeFlyableFromAviary(Flyable flyingMonster){
        animals.remove(flyingMonster);
    }

    public int numberOfAnimals(){
        return animals.size();
    }



}