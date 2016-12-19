package com.example.user.mythicalbeastszoomanager;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Cage extends Enclosure {
    private ArrayList<Mammalable> animals;

    public Cage(String name){
        super(name);
        animals = new ArrayList<Mammalable>();
    }

    public void addMammalableToCage(Mammalable walkingMonster){
        animals.add(walkingMonster);
    }

    public void removeMammalableFromCage(Mammalable walkingMonster){
        animals.remove(walkingMonster);
    }

    public int numberOfAnimals(){
        return animals.size();
    }




}