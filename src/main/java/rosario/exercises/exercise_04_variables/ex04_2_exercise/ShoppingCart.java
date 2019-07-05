/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosario.exercises.exercise_04_variables.ex04_2_exercise;

/**
 *
 * @author rosario
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 3;
        double tax = 2;
        int quantity = 1;
        double total;
        
        // Modify message to include quantity 
        message = custName+" wants to purchase "+quantity+" "+itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = price * quantity * tax;
        System.out.println("Total cost with tax is: "+total);
        
    }        
}
