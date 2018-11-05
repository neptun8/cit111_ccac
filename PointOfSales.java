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

import java.text.DecimalFormat;
import java.util.Scanner;

public class PointOfSales {

    double transationsTotal = 0.0;
    int numberOfTickets = 0;
    double totalNumberOfPizzaSales = 0.0;
    double totalNumberOfDrinksSales = 0.0;
    final static double SMALL_DOUGH_PRICE = 1.00;
    final static double MEDIUM_DOUGH_PRICE = 3.00;
    final static double LARGE_DOUGH_PRICE = 5.00;
    final static double XL_DOUGH_PRICE = 7.00;
    final static double CHEESE_PRICE = 2.50;
    final static double PEPARONI_PRICE = 3.00;
    final static double CAN_OF_SODA = 1.75;
    final static double TWO_LITER_DRINK = 3.00;
    
    public static void main(String[] args) {
    
        int choice = messageOrderHandler();
        double orderTotall = pizzaOrderHandler(choice);
        
    }
    
    
    
    
    //***************************************** 
    //All Methods
    
    
    public static int messageOrderHandler(){
        System.out.println("What would you like to order?");
        System.out.println("******************************************************************");
        System.out.println("1-Small Pizza // "
                + "2-Medium Pizza // "
                + "3-Large Pizza // "
                + "4-XL Pizza");
        System.out.println("******************************************************************");
        Scanner orderNumber = new Scanner(System.in);
        int orderSelection = orderNumber.nextInt();
        
        
       return orderSelection;
        
    }
    public static int pizzaOrderHandler(int nPizza){
        switch(nPizza){
                case 1: smallPizza();
                break;
                case 2: mediumPizza();
                break;
                case 3: largePizza();
                break;
                case 4: xlPizza();
                break;
            } 
    return nPizza;
    } // close pizzaOrderHandler
    
    public int drinksOrderHandler(){
        
    return 0;
    }
    
    public static double smallPizza(){
        
        System.out.println("Would you like to add peparoni for topping? yes=1 no=0");
        Scanner small = new Scanner(System.in);
        
        double totalSmall = 0.00;
        
        switch (small.nextInt()){
            case 1: totalSmall=SMALL_DOUGH_PRICE + CHEESE_PRICE + PEPARONI_PRICE;
            break;
            case 2: totalSmall=CHEESE_PRICE + SMALL_DOUGH_PRICE;
            break;
        }
        System.out.println("Your totall is $"+ dfRound(totalSmall));
    return totalSmall;
    } //x smallPizza 
    
    public static int mediumPizza(){
    System.out.println("Would you like to add peparoni for topping()? yes=1 no=0");
        Scanner small = new Scanner(System.in);
        
        double totalMedium = 0.00;
        
        switch (small.nextInt()){
            case 1: totalMedium=MEDIUM_DOUGH_PRICE + CHEESE_PRICE + PEPARONI_PRICE;
            break;
            case 2: totalMedium=CHEESE_PRICE + MEDIUM_DOUGH_PRICE;
            break;
        }
        System.out.println("Your totall is $ " + dfRound(totalMedium));
    return 0;
    } //x mediumPizza 
    public static int largePizza(){
    System.out.println("Would you like to add peparoni for topping? yes=1 no=0");
        Scanner small = new Scanner(System.in);
        
        double totalLarge = 0.00;
        
        switch (small.nextInt()){
            case 1: totalLarge=LARGE_DOUGH_PRICE + CHEESE_PRICE + PEPARONI_PRICE;
            break;
            case 2: totalLarge=LARGE_DOUGH_PRICE + CHEESE_PRICE ;
            break;
        }
        System.out.println("Your totall is $"+ dfRound(totalLarge));
    return 0;
    } // x largePizza
    public static int xlPizza(){
    System.out.println("Would you like to add peparoni for topping? yes=1 no=0");
        Scanner small = new Scanner(System.in);
        
        double totalXl = 0.00;
        
        switch (small.nextInt()){
            case 1: totalXl=XL_DOUGH_PRICE + CHEESE_PRICE + PEPARONI_PRICE;
            break;
            case 2: totalXl=CHEESE_PRICE + XL_DOUGH_PRICE;
            break;
        }
        System.out.println("Your totall is $ "+ dfRound(totalXl));
    return 0;
    } //x clPizza
    public static String dfRound(double num){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(num);
    }
    public static void drinkOrder(){
        System.out.println("Would you like to add a drink?");
        System.out.println("******************************************************************");
        System.out.println("1-Can Sodas //  2-Liter Coke");
        System.out.println("******************************************************************");
    }
            
    
}//close class