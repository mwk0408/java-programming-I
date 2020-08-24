
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class JokeManager {
    private ArrayList<String> list;
    public JokeManager() {
        this.list=new ArrayList<>();
    }
    public void addJoke(String joke) {
        this.list.add(joke);
    }
    public String drawJoke() {
        if (this.list.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw=new Random();
        int i=draw.nextInt(this.list.size());
        return this.list.get(i);
    }
    public void printJokes() {
        for (String string : this.list) {
            System.out.println(string);
        }
    }
}
