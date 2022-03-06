import java.util.ArrayList;

//Nutrition class
public class NutritionInfo {

    //nutrition attributes
    private double calories;
    private double proof;
    private ArrayList<String> ingredients= new ArrayList<String>();

    //NutritionInfo constructor 
    public NutritionInfo(double calories, double proof, ArrayList<String> ingredients){ //ingredients is an array of strings 
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
    public ArrayList<String> getIngredients() {
    return ingredients;
    }

    public static void main(String[] args) {
        ArrayList yo= new ArrayList<String>(2);
        NutritionInfo bob =new NutritionInfo(1, 10, yo);
        System.out.println(bob.getProof()); // Print the value of x
      }
}