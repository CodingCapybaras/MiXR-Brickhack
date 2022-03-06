package model;

import java.util.ArrayList;
import java.util.List;

/**
 * The class representation of a beverage.
 * @author Param
 */

//Beverage class
public class Beverage {

    //Beverage attributes
    private String name;
    private int id;
    private double cost;
    private double size; //in ounces
    private ArrayList color;
    private NutritionInfo nutrition;

    /**
     * Constructor used to get a beverage from the database given the id.
     * @param id
     */
    public Beverage(int id){
        this.id=id;
    }
    
    /**
     * The beverage constructor that is used to make a new beverage.
     * @param name
     * @param id
     * @param cost
     * @param size
     * @param color
     * @param nutrition
     */
    public Beverage(String name, int id, double cost, double size, ArrayList<Integer> color, NutritionInfo nutrition){
        this.name = name;
        this.id = id;
        this.cost = cost;
        this.size = size;
        this.color = color;
        this.nutrition=nutrition;
    }


    //getter methods
    public NutritionInfo getNutrition() {
        return nutrition;
    }

    public ArrayList<Integer>  getColor(){
        return color;
    }

    public double getCost() {
        return cost;
    }

    public double getSize(){
        return size;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name:\t%s \nColor:\t%s\nCost:\t%f\nSize:\t%f\nNutrition:\t%s\n", name, color.toString(),cost,size,nutrition.toString());
    }
    //Testing Beverage class

    /*
    public static void main(String [] args){
        ArrayList ingredients= new ArrayList<String>(2);
        NutritionInfo nutrition= new NutritionInfo(1, 1, ingredients);
        ArrayList color= new ArrayList<Integer>(2);
        Beverage Bev = new Beverage("coke", 10, 2.99, color, nutrition);
        System.out.println(Bev.getName());
    }
    */
    
}