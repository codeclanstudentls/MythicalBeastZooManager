package com.example.user.mythicalbeastszoomanager;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 16/12/2016.
 */
public class Zoo {

    private String name;
    private ArrayList<Enclosure> enclosures;
    private ArrayList<Visitor> visitors;


    public Zoo(String name, ArrayList<Enclosure> enclosures, ArrayList<Visitor> visitors){
        this.name = name;
        this.enclosures = enclosures;
        this.visitors = visitors;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public void addEnclosureToZoo(Enclosure enclosure){

        enclosures.add(enclosure);
    }

    public int getNumberOfEnclosuresInZoo(){

        return enclosures.size();
    }

    public void removeEnclosureFromZoo(){
        enclosures.remove(0);
    }

    public void addVisitorToZoo(Visitor visitor){
        visitors.add(visitor);
    }

    public int numberOfVisitors(){
        return visitors.size();
    }

    public void removeVisitorFromZoo(Visitor visitor){
        visitors.remove(0);
    }



}
