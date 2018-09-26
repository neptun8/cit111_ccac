
package javaapplication1;

/**
 *
 * @author sherzod.kulnazarov
 */
import java.util.Scanner;

public class FriendsLogicOnly {
    public static void main(String[] args){
        System.out.println("Welcome to my Program!");
        //hard-coded response to question 1
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int q1_User_age = scan.nextInt();
        //compatability score: this variable will be adjusted based on 
        //the user's response to questions
        int compScore = 0;
        
       
        //compares the user age for 25, if its true, it will add 5 points
        if(q1_User_age >= 27){
            compScore = compScore + 5;
            System.out.println("We still young!");
        
        }else{ 
              System.out.println("Cool, I'm 27! ");
              compScore = compScore -5;
            } // closes 1st if and else statement
        
        System.out.println("Do you play soccer? Yes=1 No=0");
        //variable to determine if user plays soccer
        int playSoccer = scan.nextInt();
        
          //ask second question
        if(playSoccer == 1){
              compScore = compScore + 5;
              System.out.println("Awsome, let's play soccer sometimes then!");        
            
        }//closes 2nd if
         else {
            System.out.println("It was really nice to meet you!");
        } //closes else
        
        System.out.println("Do you code? Yes=1 No=0");
        int doCoding = scan.nextInt();
        
          //ask second question
        if(doCoding == 1){
              compScore = compScore + 5;
              System.out.println("Awsome, I'm just learning it!");        
            
        }//closes 2nd if
         else {
            System.out.println("It was really nice to meet you!");
        } //closes else
        
        System.out.println("We could be friends.It was really nice to meet you and let's code sometimes!");
    } // closes main
}//closes class
