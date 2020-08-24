/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Song {
    private String s;
    private int n;
    public Song (String name, int length) {
        this.s=name;
        this.n=length;
    }
    public String name() {
        return this.s;
    }
    public int length() {
        return this.n;
    }
}
