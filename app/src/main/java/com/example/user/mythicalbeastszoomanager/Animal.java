package com.example.user.mythicalbeastszoomanager;

/**
 * Created by user on 16/12/2016.
 */
public class Animal {

    private String name;
    private int age;
    private double food_level;

    public Animal(String name, int age, double food_level){
        this.name = name;
        this.age = age;
        this.food_level = food_level;
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

    public void setName(String name){
        this.name = name;}

    public void setAge(int age){
        this.age = age;
    }

    public void setFood_level(double food_level){
        this.food_level = food_level;
    }




}
