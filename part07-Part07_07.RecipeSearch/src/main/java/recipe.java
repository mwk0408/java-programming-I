
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class recipe {
    private ArrayList<food> recipe;
    public recipe() {
        recipe=new ArrayList<>();
    }
    public void add(food f) {
        this.recipe.add(f);
    }
    public void printAll() {
        for (food object : recipe) {
            System.out.println(object);
        }
    }
    public void findName(String name) {
        for (food object : recipe) {
            if (object.getName().contains(name)) {
                System.out.println(object);
            }
        }
    }
    public void findTime(int time) {
        for (food object : recipe) {
            if (object.getTime()<=time) {
                System.out.println(object);
            }
        }
    }
    public void findIngredient(String ingredient) {
        int index=2;
        for (food object : recipe) {
            while (true) {                
                if (object.getIngredient(index).isEmpty()) {
                    break;
                } else if (object.getIngredient(index).equals(ingredient)) {
                    System.out.println(object);
                    break;
                }
                index++;
            }
            index=2;
        }
    }
}
