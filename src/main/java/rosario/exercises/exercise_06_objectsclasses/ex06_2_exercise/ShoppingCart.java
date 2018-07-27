/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosario.exercises.exercise_06_objectsclasses.ex06_2_exercise;

import rosario.exercises.exercise_06_objectsclasses.ex06_1_exercise.Item;

/**
 *
 * @author rosario
 */
public class ShoppingCart {
    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item pantalon = new Item();
        Item playera = new Item();
        
        pantalon.descr ="prenda de vestir para la parte inferior";
        playera.descr ="prenda de vestir para la parte superior";
	// Print both item descriptions and run code.
        System.out.println(pantalon.descr);
        System.out.println(playera.descr);
	// Assign one item to another and run it again.
        playera = pantalon;
        System.out.println(playera.descr);
     }
}
