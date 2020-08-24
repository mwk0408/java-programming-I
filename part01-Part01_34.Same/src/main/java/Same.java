
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s=scan.nextLine();
        String s2=scan.nextLine();
        if (s.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        } 
    }
}
