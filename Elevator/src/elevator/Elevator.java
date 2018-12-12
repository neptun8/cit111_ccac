/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

import java.util.Scanner;

/**
 *
 * @author Sherzod
 */
public class Elevator {

    //memeber variables
    
    public int currentFloor=0;
    //public String door = "Closed"; 
    //public boolean isOn = true;
    
    //methods
    public void selectFloor() {
        Scanner scnr = new Scanner(System.in);
        int newFloor;

        System.out.println("Enter the floor you'd like to go to ==> ");
        newFloor = scnr.nextInt();
        if (newFloor > 100 || newFloor < 0 || newFloor == 13) {
            System.out.println("Invalid selection");
        }

        else if (newFloor <= 100 && newFloor > 0 && newFloor != 13) {
            for (int i = 1; i <= newFloor; i++)
                System.out.println("..." + i);
                System.out.println("Ding!");
                backToBasement(newFloor);
        }
    }

    public void fireAlarm() {
        System.out.println("Danger, you must exit the building now!");
    }

    public void backToBasement(int newFloor){
        for (int i=newFloor; i>0;i--){
             System.out.println("..." + i);
        }
        System.out.println("Ding!... Back to Ground Level");

    }
    
    
//    int getCurrentFloor(){
//        CurrentFloor = floor;
//        return CurrentFloor;
//    }
//    public int changeFloor(f){
//        floor = amount;
//    }
//    void goToFloor(int i){
//        
//        if (floor<=5) {
//            floor=5;
//        }
//        else{
//            floor=1;
//        }
//    }
//    public void messagePrint(){
//        
//        System.out.println("____G____");
//        System.out.println("____1____");
//        System.out.println("____2____");
//        System.out.println("____3____");
//        System.out.println("____4____");
//        System.out.println("____5____");
//        System.out.println("____6____");
//        System.out.println("____7____");
//        System.out.println("____8____");
//        System.out.println("____9____");
//        
//    }//close messagePrint
//    
}
