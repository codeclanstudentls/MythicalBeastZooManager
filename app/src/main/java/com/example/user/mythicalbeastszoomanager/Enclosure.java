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

    public Enclosure(String name, ArrayList<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAnimalToCage(Animal animal) {
        animals.add(animal);
    }

    public int getNumberOfAnimalsInEnclosure() {
        return animals.size();
    }

    public void removeAllAnimalsFromEnclosure() {
        animals.clear();
        // This removes all Animals.  Need to be more selective and have them removed by index value
        // Also this means all animals will be 'lost'.
    }


    public String removeAnimalFromEnclosureByObject (String name){

        for (Animal animal : animals){

            if (animal.getName().equals(name)){
                animals.remove(animal);
                return String.format(name + " was removed");
            }

        }return null;
    }

}






