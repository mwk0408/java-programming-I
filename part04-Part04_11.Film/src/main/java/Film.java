/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Film {
    private String s;
    private int rate;
    public Film(String filmName, int filmAgeRating) {
        this.s=filmName;
        this.rate=filmAgeRating;
    }
    public int ageRating() {
        return this.rate;
    }
    public String name() {
        return this.s;
    }
}
