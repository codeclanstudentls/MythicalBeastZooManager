package com.example.user.mythicalbeastszoomanager;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 16/12/2016.
 */
public class Enclosure {
    private String name;
    private ArrayList<Animal> animals;
    //private String type;

    public Enclosure(String name, ArrayList<Animal> animals){
        this.name = name;
        this.animals = animals;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addAnimalToCage(Animal animal){
        animals.add(animal);
    }

    public int getNumberOfAnimalsInEnclosure(){
        return animals.size();
    }

    public void removeAllAnimalsFromEnclosure(){
        animals.remove(animals);
        // This only removes all Animals.  Need to be more selective and have them removed by index value
    }

    public void removeAnimalFromEnclosure() {
        // need to be careful to use the correct method to remove from an arraylist as I think it effects the indexing?
    }

}
