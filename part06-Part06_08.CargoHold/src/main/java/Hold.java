/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
import java.util.ArrayList;
public class Hold {
    private ArrayList<Suitcase> hold;
    private int sum=0;
    private int limit;
    public Hold(int limit) {
        this.hold=new ArrayList<>();
        this.limit=limit;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (this.sum+suitcase.totalWeight()<=this.limit) {
            this.hold.add(suitcase);
            this.sum+=suitcase.totalWeight();
        }
    }
    public String toString() {
        return this.hold.size()+" suitcases ("+this.sum+" kg)";
    }
    public void printItems() {
        for (Suitcase suitcase : this.hold) {
            suitcase.printItems();
        }
    }
}
