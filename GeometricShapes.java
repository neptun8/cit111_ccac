/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods.week8_methods2;
import java.util.Scanner;
/**
 *
 * @author sherzod.kulnazarov
 */
public class GeometricShapes {
    public static void main(String[] args) {
        
//passes statement to user, ask for input
        System.out.println("Please enter side-lenght of a cube: ");
//scans for user input and stores the value into "sc" variable
        Scanner sc = new Scanner(System.in);
//before printing cube area, calls method calcVolumeOfCube and passes
//user input from scanner. Once it recieves value back from called method
//it prints statemnet + returned value from "calcVolumeOfCube"
        System.out.println("Volume of a cube is " + calcVolumeOfCube(sc.nextDouble()));
        System.out.println("********************************************************");
        System.out.println();
        System.out.println("Enter base lenght of pyramid: ");
        double enteredBaseLenght = sc.nextDouble();
        System.out.println("Enter base width of pyramid: ");
        double enteredBaseWidth = sc.nextDouble();
        System.out.println("Enter height of pyramid: ");
        double enteredheight = sc.nextDouble();
        double volumeResult = calcVolumeOfPyramid(enteredBaseLenght, enteredBaseWidth, enteredheight);
        String strDouble = String.format("%.2f", volumeResult);
        System.out.println("Volume of a pyramid is ≈ " + strDouble);
        
    }//close main
    
    public static double calcVolumeOfCube(double sideLenght){
        //takes value from type double and stores to sideLenght
        double cubeVolume = Math.pow(sideLenght, 3);
        //rises sideLenght to 3rd pow.
        return cubeVolume;
        //returns back to point where it was called
    }//close calcVolumeOfCube
    
    //method to calculate pyramid volume
    public static double calcVolumeOfPyramid(double baseLenght, double baseWidth,double pyramidHeight){
    
    double L = baseLenght;
    double W = baseWidth;
    double H = pyramidHeight;
    double V = (L*W*H)/3;
    return V;
    }   
  
}//close class
