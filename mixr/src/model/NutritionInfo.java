package model;

import java.util.ArrayList;

/**
 * The class representation of nutrition.
 * @author Param
 */

//NutritionInfo class
public class NutritionInfo {

    //nutrition attributes
    private double calories;
    private double proof;
    private String[] ingredients;

    //NutritionInfo constructor 
    public NutritionInfo(double calories, double proof, String[] ingredients){ //ingredients is an array of strings 
        this.calories=calories;
        this.proof = proof;
        this.ingredients = ingredients;
    }

    //getter methods
    public double getCalories() {
    return calories;
    }
    public double getProof() {
    return proof;
    }
    public String[] getIngredients() {
    return ingredients;
    }

    //Beverage tester
    /*
    public static void main(String[] args) {
        ArrayList yo= new ArrayList<String>(2);
        NutritionInfo bob =new NutritionInfo(1, 10, yo);
        System.out.println(bob.getProof()); // Print the value of x
      }
      */
}