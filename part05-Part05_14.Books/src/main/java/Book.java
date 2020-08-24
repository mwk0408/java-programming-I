
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public boolean equals(Object compared) {
        if (compared==this) {
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        Book temp=(Book)compared;
        if (temp.name.equals(this.name) && temp.publicationYear==this.publicationYear) {
            return true;
        }
        return false;
    }
}
