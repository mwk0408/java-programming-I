
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

   public boolean equals (Object compared) {
       if (birthday==compared) {
           return true;
       }
       if (!(compared instanceof Person)) {
           return false;
       }
       Person temp =(Person) compared;
       if (temp.name==this.name && temp.birthday.equals(this.birthday) 
               && this.height==temp.height 
               && this.weight==temp.weight) {
           return true;
       }
       return false;
   }
}
