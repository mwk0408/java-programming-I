
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
public class bird {
    private ArrayList<String> name;
    private ArrayList<String> latinName;
    private ArrayList<Integer> count;
    public bird(){
        this.name=new ArrayList<>();
        this.latinName=new ArrayList<>();
        this.count=new ArrayList<>();
    }
    public void addName(String name) {
        this.name.add(name);
    }
    public void addLatinName(String name) {
        this.latinName.add(name);
    }
    public void addCount() {
        this.count.add(0);
    }
    public boolean observation(String name) {
        int index=0;
        for (String string : this.name) {
            if (string.equals(name)) {
                int old=this.count.get(index);
                old+=1;
                count.set(index, old);
                return true;
            }
            index++;
        }
        return false;
    }
    public void printString() {
        int index=0;
        while (index<this.count.size()) {    
            System.out.println(this.name.get(index)+" ("
            +this.latinName.get(index)+"): "
            +this.count.get(index)+" observations");
            index++;
        }
    }
    public void printOne(String name) {
        int index=0;
        for (String string : this.name) {
            if (string.equals(name)) {
                System.out.println(this.name.get(index)+" ("
                +this.latinName.get(index)+"): "
                +this.count.get(index)+" observations");
            }
            index++;
        }
    }
}
