
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<archive> s=new ArrayList<>();
        String name;
        String id;
        while (true) {            
            System.out.println("Identifier? (empty will stop)");
            id=scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            name=scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            archive a= new archive(id, name);
            if (!(s.contains(a))) {
                s.add(a);
            }
        }
        for (archive object : s) {
            System.out.println(object);
        }
    }
}
