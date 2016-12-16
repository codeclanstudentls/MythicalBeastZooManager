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

    // need to be careful to use the correct method to remove from an arraylist as I think it effects the indexing?
    //     Jarrod has suggested using a remove by object method on the arraylist of animal objects but not sure how to do this

//      e.g. public boolean remove(Object o)

//      public boolean removeAnAnimalFromEnclosure(Object animal1) {

//
//    }
//
//    public boolean equals(Object obj){
//        if (obj == null) return false;
//        if (obj == this) return true;
//        if (!(obj instanceof Animal)) return false;
//        Animal animal1 = (Animal) obj;
//        return animal1.i == this.i;
//    }

    public String removeAnimalFromEnclosureByObject (String name){

        for (Animal animal : animals){

            if (animal.getName().equals(name)){
                animals.remove(animal);
                return String.format(name + " was removed");
            }
        }return null;
    }

}






