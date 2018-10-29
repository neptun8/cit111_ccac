/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author sherzod.kulnazarov
 */

import java.util.Scanner;

public class PointOfSales {

    double transationsTotal = 0.0;
    int numberOfTickets = 0;
    double totalNumberOfPizzaSales = 0.0;
    double totalNumberOfDrinksSales = 0.0;
    final double SMALL_DOUGH_PRICE = 1.00;
    final double MEDIUM_DOUGH_PRICE = 3.00;
    final double LARGE_DOUGH_PRICE = 5.00;
    final double XL_DOUGH_PRICE = 7.00;
    final double CHEESE_PRICE = 2.50;
    final double PEPARONI_PRICE = 3.00;
    final double CAN_OF_SODA = 1.75;
    final double TWO_LITER_DRINK = 3.00;
    
    public static void main(String[] args) {
    
        
        
            
    }
     
    
    
    public int pizzaOrderHandler(){
        int pizza = 0;
        
            switch(pizza){
                case 1: smallPizza();
                break;
                case 2: mediumPizza();
                break;
                case 3: largePizza();
                break;
                case 4: xlPizza();
                break;
            } 
    return pizza;
    } // close pizzaOrderHandler
    
    public int drinksOrderHandler(){
        
    return 0;
    }
    
    public int smallPizza(){
        
        System.out.println("Would you like to add peparoni for topping? yes=1 no=0");
        Scanner small = new Scanner(System.in);
        double totalSmall = 0.00;
        
        switch (small.nextInt()){
            case 1: (SMALL_DOUGH_PRICE + CHEESE_PRICE + PEPARONI_PRICE) = totalSmall;
            break;
            case 2: SMALL_DOUGH_PRICE + CHEESE_PRICE = totalSmall;
            break;
        }
    return totalSmall;
    } //x smallPizza 
    
    public int mediumPizza(){
    
    return 0;
    } //x mediumPizza 
    public int largePizza(){
    
    return 0;
    } // x largePizza
    public int xlPizza(){
    
    return 0;
    } //x clPizza
    
    public messageHandler(){
        
    }
}//close class

