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
public class Package {
    private ArrayList<Gift> pack;
    public Package() {
        this.pack=new ArrayList<>();
    }
    public void addGift(Gift gift) {
        this.pack.add(gift);
    }
    public int totalWeight() {
        int sum=0;
        for (Gift gift : this.pack) {
            sum+=gift.getWeight();
        }
        return sum;
    }
}
