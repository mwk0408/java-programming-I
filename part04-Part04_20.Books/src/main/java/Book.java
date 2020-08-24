/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Book {
    private String name;
    private int page;
    private int year;
    public Book (String name, int page, int year) {
        this.name=name;
        this.page=page;
        this.year=year;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.name+", "+this.page+" pages, "+this.year;
    }
}
