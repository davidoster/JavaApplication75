/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.ICarActions;

/**
 *
 * @author George.Pasparakis
 */
public class Ferrari extends Car {

    public Ferrari() {
        super("This is Ferrari");
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
