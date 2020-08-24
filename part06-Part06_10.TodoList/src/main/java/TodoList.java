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
public class TodoList {
    private ArrayList<String> list;
    public TodoList() {
        this.list=new ArrayList<>();
    }
    public void add(String task) {
        list.add(task);
    }
    public void print() {
        if (!(list.isEmpty())) {
            int index=1;
            for (String string : list) {
                System.out.println(index+": "+string);
                index++;
            }
        }
    }
    public void remove(int number) {
        if (!(list.isEmpty())) {
            list.remove(number-1);
        }
    }
}
