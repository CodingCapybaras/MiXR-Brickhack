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
    private double totalCost;
    private ArrayList color;
    private NutritionInfo nutrition;
    private int likes; //rating


    //Mix constructor 
    public Mix(String name, HashMap<Integer, String> mixer, int id, ArrayList<Beverage> beverages, User user){
        this.name = name;
        this.mixer=mixer;
        this.id = id;
        this.beverages=beverages;
        this.user=user;
    }


    //getter methods
    public NutritionInfo getNutrition() {
        double totalCalories=0;
        Set<String> set= new HashSet<String>();
        ArrayList<String> ing = new ArrayList<String>();
        for(Beverage bev: beverages){
           totalCalories=bev.getNutrition().getCalories();
            for(String nutr: bev.getNutrition().getIngredients()) //gets the ingredients of each beverage
            { 
                set.add(nutr);            
            } 
        }
        //putting the set into arraylist
        for(String ingred: set){
            ing.add(ingred);
        }

        nutrition = new NutritionInfo(totalCalories, proof, ing);
        return nutrition;
    }
    //haven't been calculated
    public ArrayList<Integer>  getColor(){
        return color;
    }
    public double getProof(){
        double totalAlcohol = 0;
        double totalSize=0;
        for(Beverage bev: beverages){
            totalAlcohol+=(bev.getSize())*(bev.getNutrition().getProof()/100); //total amount of alcohol in mixture
            totalSize+=bev.getSize(); //total amount of liquid in mixture
        }
        proof = (totalAlcohol/totalSize);
        return proof;
    }
    public double getCost() {
        for(Beverage bev: beverages){
            totalCost+=(bev.getSize())*(bev.getCost()); //cost times size per oz
        }
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
    public void addBev(Beverage Bev){
        beverages.add(Bev); //add Beverage to mix
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