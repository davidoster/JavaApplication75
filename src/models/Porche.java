/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.ICarProperties;

/**
 *
 * @author George.Pasparakis
 */
public class Porche extends Car {
    private int noOfDoors;
    
    public Porche() {
        super();
    }
    
    public Porche(String name, String color, String engine){
        this.name = name; // this.setName(name);
        this.color = color;
        this.engine = engine;
        
        
        this.aMethod("sadfsdfsdf");
    }
    
    public int getNoOfDoors() {
        return(this.noOfDoors);
    }
    
    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is stopped!");
    }

    @Override
    public void factorySettings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int makeProperty1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
