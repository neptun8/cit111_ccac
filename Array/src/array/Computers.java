/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import java.util.Scanner;

/**
 *
 * @author sherzod.kulnazarov
 */
public class Computers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    // create an array of string called Computers
    //that stores the name of the old computers
    String[] Computers = new String[6]; // MAKE AN OBJECT!
    
    Computers[0] = "Amiiga 4000DP";
    Computers[1] = "Apple Lisa";
    Computers[2] = "Commodore-64";
    Computers[3] = "Macintosh Portable-64";
    Computers[4] = "IBM PC XT 286";
    Computers[5] = "MacBook Pro 2017";
    //creating scanner object to get user input
    Scanner scanner = new Scanner(System.in);
    //ask user to select number 0-5
        System.out.println("Please enter shelf number you would like 0-5: ");
        //store input on numberSelected, type int
        int numberSelected = scanner.nextInt();
        //use the numberSelected to print array
        System.out.println("Your selected self: " + numberSelected + ", and this shelf "
                + "contains " + Computers[numberSelected]);
    
    
       
    }//close main mehtod
//    public static void printNamesOfComputers(String[] StringArray) {
//        System.out.println("");
//        System.out.println("**************Accesing array with while loop**************");
//        
//        //create a counter variable i that we can use to 
//        //iterate over (loop) the array
//        int i = 0;
//        //ask the array it's length (size) and store its value in arraySize
//        int arraySize = StringArray.length;
//        //use the while()- controlled block to control the looping 
//        //loop 5 total times, once for each bin in the array
//        while(i < arraySize){
//            //we can replace our hard-coded numbers with i
//            System.out.println("Name of the computers in the shelf "+
//                    + i + ": "+String.valueOf(StringArray[i]));
//            //increment i, so we can look each shelf;
//            i = i + 1;
//        }//close the while
//    }//close the print method
    public static void customCallTheArray(String[] strings) {
        System.out.println("");
        System.out.println("**************Accesing array with Switch**************");
        //initialiazing n as 0;
        int n = 0;
        //using scanner tool to get input from user
        //creating new scanner object that takes input from system.in(keyboard)
        
        
        
    }
}//close class
