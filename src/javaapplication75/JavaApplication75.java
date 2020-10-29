/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;
import models.*;
/**
 *
 * @author George.Pasparakis
 */
public class JavaApplication75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Car car = new Car();
//        Car car2 = new Car("XXX");
        
//        // instantiate object of tyoe Porche
        Porche porche = new Porche("Porche", "Grey", "V4");
        porche.getNoOfDoors();
//        porche
        
//         Polymorphism
        Car porche2 = new Porche("Porche", "Grey", "V4");
        porche2.getName();
        
        Ferrari ferrari = new Ferrari();
        ferrari.stopEngine();
        
        Car ferrari2 = new Ferrari();
        ferrari2.stopEngine();
    }
    
}
