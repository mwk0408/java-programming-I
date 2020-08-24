/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class archive {
    private String id;
    private String name;
    public archive(String id, String name) {
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object compared) {
        if (this==compared) {
            return true;
        }
        if (!(compared instanceof archive)) {
            return false;
        }
        archive temp= (archive) compared;
        if (temp.id.equals(this.id)) {
            return true;
        }
        return false;
    }
    public String toString() {
        return this.id+": "+this.name;
    }
}
