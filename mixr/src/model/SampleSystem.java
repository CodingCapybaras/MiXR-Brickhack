package model;

import java.util.ArrayList;

/**
 * A sample of a comic system to be used for react page
 * @author Zoe Bingham
 */

public class SampleSystem {
    public static void makeSample(){
        // Make some default beverages
        String name = "Peach seltzer"; int id = 1; double cost = 2.99; double size = 1.0; ArrayList<Integer> color = new ArrayList<>(){{add(255); add(255); add(255); add(100);}}; NutritionInfo nutrition = new NutritionInfo(200, 2.5, new ArrayList<String>(){{add("yeast"); add("water"); add("sugar"); add("peach");}});
        Beverage pSeltzer = new Beverage(name, id, cost, size, color, nutrition);
        System.out.println(pSeltzer);

        name = "Apple seltzer"; id = 1; cost = 2.99; size = 1.0; ArrayList<Integer> color1 = new ArrayList<>(){{add(255); add(255); add(255); add(100);}}; NutritionInfo nutrition1 = new NutritionInfo(200, 2.5, new ArrayList<String>(){{add("yeast"); add("water"); add("sugar"); add("apple");}});
        Beverage aSeltzer = new Beverage(name, id, cost, size, color1, nutrition1);
        System.out.println(aSeltzer);

        name = "Sparkling water"; id = 1; cost = 2.99; size = 1.0; ArrayList<Integer> color2 = new ArrayList<>(){{add(255); add(255); add(255); add(1);}}; NutritionInfo nutrition2 = new NutritionInfo(200, 2.5, new ArrayList<String>(){{add("carbonation"); add("water"); add("sugar"); add("lime");}});
        Beverage sparklingWater = new Beverage(name, id, cost, size, color2, nutrition2);
        System.out.println(sparklingWater);
        
        
    }

    public static void main(String[] args) {
        makeSample();
    }
}