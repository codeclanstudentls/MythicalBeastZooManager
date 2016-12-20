package com.example.user.mythicalbeastszoomanager;

/**
 * Created by user on 20/12/2016.
 */
public class Visitor {
    int visitorNumber;

    public Visitor(int visitorNumber){
        this.visitorNumber = visitorNumber;
    }

    public void setNumber(int visitorNumber){
        this.visitorNumber = visitorNumber;
    }

    public int getNumber(int visitorNumber){
        return this.visitorNumber;
    }

}
