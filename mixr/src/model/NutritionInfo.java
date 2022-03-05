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


}