
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
public class food {
    private ArrayList<String> food;
    public food() {
        this.food=new ArrayList<>();
    }
    public void add(String s) {
        this.food.add(s);
    }
    public String getName() {
        return this.food.get(0);
    }
    public int getTime() {
        return Integer.valueOf(this.food.get(1));
    }
    public String toString() {
        return this.food.get(0)+", cooking time: "+this.food.get(1);
    }
    public int size() {
        return this.food.size();
    }
    public String getIngredient(int index) {
        if (index>=2 && index<=this.food.size()-1) {
            return this.food.get(index);
        }
        return "";
    }
}
