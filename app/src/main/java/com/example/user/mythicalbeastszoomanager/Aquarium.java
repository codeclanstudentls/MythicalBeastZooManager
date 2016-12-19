package com.example.user.mythicalbeastszoomanager;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Aquarium extends Enclosure {
    private ArrayList<Swimmable> animals;

    public Aquarium(String name){
        super(name);
        animals = new ArrayList<Swimmable>();
    }

    public void addSwimmableToAquarium(Swimmable waterMonster){
        animals.add(waterMonster);
    }

    public void removeSwimmableFromAquarium(Swimmable waterMonster){
        animals.remove(waterMonster);
    }

    public int numberOfAnimals(){
        return animals.size();
    }




}
