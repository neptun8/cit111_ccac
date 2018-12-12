/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

import java.util.Scanner;

/**
 *
 * @author Sherzod Kulnazarov
 */
public class Elevator {

    //memeber variables
    public int currentFloor = 0;

    //methods
    public void selectFloor() {
        //new scanner object
        Scanner scnr = new Scanner(System.in);
        int newFloor;
        //ask the floor
        System.out.println("Enter the floor you'd like to go to ==> ");
        newFloor = scnr.nextInt(); //stores the floor
        //checks the entered floor for following parametrs
        //if its true prints "Invalid Selection"
        if (newFloor > 100 || newFloor < 0 || newFloor == 13) {
            System.out.println("Invalid selection");
        } //close if
        //otherwise
        else if (newFloor <= 100 && newFloor > 0 && newFloor != 13) {
            //increments to selected floor
            for (int i = 1; i <= newFloor; i++) //prints increments 
            {
                System.out.println("..." + i);
            }
            //prints when it reaches selected floor
            System.out.println("Ding!");
            //calls method back to basement

            backToBasement(newFloor);
        }//close else if
    }//close selectFloor method
    //method for fire alarm

    public void fireAlarm() {
        System.out.println("Danger, you must exit the building now!");
    }//close fireAlarm

    //mehtod back to basement
    public void backToBasement(int newFloor) {
        //accepts input from selectFloor and 
        //reduces untill reaches basement floor
        for (int i = newFloor; i > 0; i--) {
            System.out.println("..." + i);
        }
        //prints when elevator is at the basement level..
        System.out.println("Ding!... Back to Ground Level");
    }//close method backtobasement
}//close class
