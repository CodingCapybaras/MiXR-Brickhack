package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

//Mix class
public class Mix {

    //Mix attributes
    private String name;
    private int id;
    private ArrayList<Beverage> beverages;
    private User user;
    HashMap<Integer, String> mixer = new HashMap<>();

    //need to calculate with Arraybeverages 
    private double proof;
    private double totalCost =0;
    private ArrayList color;
    private NutritionInfo nutrition;
    private int likes; //rating
    private double totalAlcohol=0;
    private double totalSize=0;


    //Mix constructor 
    public Mix(String name, HashMap<Integer, String> mixer, int id, ArrayList<Beverage> beverages, User user){
        this.name = name;
        this.mixer=mixer;
        this.id = id;
        this.beverages=beverages;
        this.user=user;

        //Calculate the total cost,alcohol and amount of beverage(size)
        for(Beverage bev: this.beverages){
            this.totalCost+=(bev.getSize())*(bev.getCost()); 
            this.totalAlcohol+=(bev.getSize())*(bev.getNutrition().getProof()/100); //total amount of alcohol in mixture
            this.totalSize+=bev.getSize(); //total amount of liquid in mixture
        }
        proof=totalAlcohol/totalSize;
    }


    //getter methods
    public NutritionInfo getNutrition() {
        double totalCalories=0;
        Set<String> set= new HashSet<String>();
        ArrayList<String> ing = new ArrayList<String>();
        //nested for loop to get every single ingredient in every beverage
        for(Beverage bev: beverages){
            //increasing calories
            totalCalories+=bev.getNutrition().getCalories()*bev.getSize();//calories per oz * oz
            for(String nutr: bev.getNutrition().getIngredients()) //gets the ingredients of each beverage
            { 
                set.add(nutr);            
            } 
        }
        //putting the set into arraylist
        for(String ingred: set){
            ing.add(ingred);
        }
        //setting mix's nutrition
        nutrition = new NutritionInfo(totalCalories, proof, ing);
        return nutrition;
    }
    //haven't been calculated
    public ArrayList<Integer>  getColor(){
        return color;
    }
    //caclulating alcohol percentage
    public double getProof(){
        proof = (totalAlcohol/totalSize);
        return proof;
    }
    public User getUser(){
        return user;
    }
    //calculating cost of drink
    public double getCost() {
        return totalCost;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getLikes(){
        return likes;
    }
    public void incrementRating(){
        likes+=1;
    }
    public void decrementRating(){
        likes-=1;
    }
    public void addBev(Beverage bev){
        //have to recalc mix after adding bev
        beverages.add(bev); //add Beverage to mix
        totalCost+=(bev.getSize())*(bev.getCost());
        totalAlcohol+=(bev.getSize())*(bev.getNutrition().getProof()/100);
        totalSize+=bev.getSize(); 
        proof = (totalAlcohol/totalSize);

    }

    //public void addMixToDB(beverages)

    //Testing Mix class

    /*
    public static void main(String [] args){
        ArrayList ingredients= new ArrayList<String>(2);
        NutritionInfo nutrition= new NutritionInfo(1, 1, ingredients);
        ArrayList color= new ArrayList<Integer>(2);
        Mix Bev = new Mix("coke", 10, 2.99, color, nutrition);
        System.out.println(Bev.getName());
    }
    */
    
}