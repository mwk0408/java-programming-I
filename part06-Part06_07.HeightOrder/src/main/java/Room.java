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
public class Room {
    private ArrayList<Person> room;
    public Room() {
        this.room=new ArrayList<>();
    }
    public void add(Person person) {
        this.room.add(person);
    }
    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person res=this.room.get(0);
        for (Person person : this.room) {
            if (person.getHeight()<res.getHeight()) {
                res=person;
            }
        }
        return res;
    }
    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person res=this.room.get(0);
        int index=0;
        int comp=0;
        for (Person person : this.room) {
            if (person.getHeight()<res.getHeight()) {
                res=person;
                comp=index;
            }
            index++;
        }
        return this.room.remove(comp);
    }
}
