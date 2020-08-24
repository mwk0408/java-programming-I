import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> book= new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String s;
        int p;
        int y;
        while (true) {
            System.out.println("Title: ");
            s=scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            p=Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            y=Integer.valueOf(scanner.nextLine());
            book.add(new Book(s, p, y));
        }
        String rec;
        System.out.println("What information will be printed? ");
        rec=scanner.nextLine();
        if (rec.equals("everything")) {
            for (Book book1 : book) {
                System.out.println(book1);
            } 
        } else if (rec.equals("name")) {
            for (Book book1 : book) {
                System.out.println(book1.getName());
            }
        }
    }
}
