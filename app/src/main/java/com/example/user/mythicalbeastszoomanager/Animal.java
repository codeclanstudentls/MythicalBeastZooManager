package com.example.user.mythicalbeastszoomanager;

/**
 * Created by user on 16/12/2016.
 */
public class Animal {

    private String name;
    private int age;
    private double food_level;
    private double poop_level;
    private String species_name;

    public Animal(String name, int age, double food_level, double poop_level, String species_name){
        this.name = name;
        this.age = age;
        this.food_level = food_level;
        this.poop_level = poop_level;
        this.species_name = species_name;

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getFood_level(){
        return this.food_level;
    }

    public double getPoop_level(){
        return this.poop_level;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setFood_level(double food_level){
        this.food_level = food_level;
    }

    public String getSpeciesName(){
        return this.species_name;
    }

    public void setSpeciesName(String species_name){
        this.species_name = species_name;
    }




}
