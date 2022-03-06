import java.util.ArrayList;
import java.util.List;

//Beverage class
public class Beverage {

    //Beverage attributes
    private String name;
    private int id;
    private double cost;
    private double size; //in ounces
    private ArrayList color;
    private NutritionInfo nutrition;

    public Beverage(int id){
        this.id=id;
    }
    //Beverage constructor 
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