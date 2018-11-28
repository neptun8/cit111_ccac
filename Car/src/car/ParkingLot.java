/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;
import java.util.Scanner;
/**
 *
 * @author sherzod.kulnazarov
 */
public class ParkingLot {
    public static void main(String[] args) {
        //first car instance
        Car Sonata16 = new Car();
        Sonata16.Make = "Hyundai";
        Sonata16.Model = "Sonata";
        Sonata16.Year = 2016;
        Sonata16.engineSize = "2.4L";
        Sonata16.turnOn(true);
        Sonata16.Accelerate(22);
        Sonata16.getGear();
        Sonata16.PrintMessage();
        //second car instance
        Car McLaren = new Car();
        McLaren.Make = "McLaren";
        McLaren.Model = "P1";
        McLaren.Year = 2020;
        McLaren.engineSize = "3.8 L";
        McLaren.PrintMessage();
        
                
    }
    public static void printStats(){
        System.out.println();
    }
      
}
