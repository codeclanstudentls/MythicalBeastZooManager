package com.example.user.mythicalbeastszoomanager;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class Zoo {

    private String name;
    private ArrayList<Enclosure> enclosures;

    public Zoo(String name, ArrayList<Enclosure> enclosures){
        this.name = name;
        this.enclosures = enclosures;
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



}
