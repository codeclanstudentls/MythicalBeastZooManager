package com.example.user.mythicalbeastszoomanager;

/**
 * Created by user on 16/12/2016.
 */
public abstract class Animal {

    private String name;
    private String species;
    private int age;
    private double foodLevel;


    public Animal(String name, String species, int age, double foodLevel){
        this.name = name;
        this.species = species;
        this.age = age;
        this.foodLevel = foodLevel;

    }

    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public int getAge(){
        return this.age;
    }

    public double getFoodLevel(){
        return this.foodLevel;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setFoodlevel(double foodLevel){
        this.foodLevel = foodLevel;
    }

//    public void poo() {
//        this.foodLevel -= 10;
//    }
//
//    public void eat() {
//        this.foodLevel += 10;
//    }


    // public void feedAnimal(){
        // how am I going to lower these levels without hard coding stuff? Use an 'eat' method which will affect foodLevel
        // this.foodLevel = foodLevel + 10.00;






}
