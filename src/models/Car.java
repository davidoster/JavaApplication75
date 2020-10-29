/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.ICarActions;
import interfaces.ICarProperties;

/**
 *
 * @author George.Pasparakis
 */
public abstract class Car implements ICarActions, ICarProperties {
    
    // public
    // protected
    // private
    
    protected String name;
    protected String color;
    protected String engine;
    
    public Car() {
        aMethod("XYZZ");
    }
    
    public Car(String message) {
        aMethod(message);
    }
    
    protected void aMethod(String message) {
        System.out.println("Car");
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    public abstract void factorySettings();
}
