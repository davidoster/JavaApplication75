/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author George.Pasparakis
 */
public interface ICarActions {
    
    public static void startEngine() {
        System.out.println("Engine has started");
    }
    
    public abstract void stopEngine();
    
}
