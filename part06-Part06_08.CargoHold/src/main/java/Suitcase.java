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
public class Suitcase {
    private ArrayList<Item> list;
    private int limit;
    private int sum=0;
    public Suitcase(int limit) {
        this.list=new ArrayList<>();
        this.limit=limit;
    }
    public void addItem(Item item) {
        if (this.sum+item.getWeight()<=this.limit) {
            this.list.add(item);
            this.sum+=item.getWeight();
        }
    }
    public String toString() {
        if (this.list.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.list.size()==1) {
            return this.list.size()+" item ("+this.sum+" kg)";
        }
        return this.list.size()+" items ("+this.sum+" kg)";
    }
    public void printItems() {
        if (!(this.list.isEmpty())) {
            int i=0;
            for (Item item : this.list) {
                i++;
                if (i==this.list.size()) {
                    break;
                }
                System.out.println(item.toString()+"\n");
            }
            System.out.println(this.list.get(i-1).toString());
        }
    }
    public int totalWeight() {
        return this.sum;
    }
    public Item heaviestItem() {
        if (this.list.isEmpty()) {
            return null;
        }
        Item res=this.list.get(0);
        for (Item item : this.list) {
            if (res.getWeight()<item.getWeight()) {
                res=item;
            }
        }
        return res;
    }
}
