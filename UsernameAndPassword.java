/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author sherzod.kulnazarov
 */
public class UsernameAndPassword {
    public static void main(String[] args){
        
//declaration of input variable
        String enteredPassword;
        String enteredUserName;
        String userName = "nyhack";
        String userPass = "thedoctor";
        int attemps = 0;
        int limit = 3;

        while(true){
        
//start scanner 
        Scanner userInputScanner = new Scanner(System.in);

//asking user to input username
        System.out.println("Enter user name: ");
        enteredUserName = userInputScanner.next();

//asking user to input password
        System.out.println("Enter password: ");
        enteredPassword = userInputScanner.next();
//compares entered username with stored user name       
        if(enteredUserName.equals(userName) && enteredPassword.equals(userPass)){
            System.out.println("Access Granted!");
//does not match: prints access denied and logs attemps            
        }else{
            System.out.println("Access Denied!");
            
            attemps = attemps + 1;
            //prints limit and attemp
            System.out.println("You have attempted " + attemps + " times!");
            System.out.println("You have "+ (limit - attemps) + " tries!");
            //attemp equals limit program breaks;
            if(limit == attemps) {
                System.out.println("You are locked out!");
                break;
            }    
        }
    }
        
}

