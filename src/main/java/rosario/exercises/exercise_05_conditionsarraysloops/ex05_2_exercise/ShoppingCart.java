/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosario.exercises.exercise_05_conditionsarraysloops.ex05_2_exercise;

/**
 *
 * @author rosario
 */
public class ShoppingCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String []fruits = {"Mango","Sandia","Uva","Fresa"};
       
        // Change message to show the number of items purchased.
        message = custName + " wants to purchase "+fruits.length+" items.";
        System.out.println(message);
        
        // Print an element from the items array.  
        System.out.println(fruits[3]);
        
    }
}
