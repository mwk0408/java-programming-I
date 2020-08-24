
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String s;
        while (true) {            
            System.out.println("Name: ");
            s=scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }
            items.add(new Item(s));
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
