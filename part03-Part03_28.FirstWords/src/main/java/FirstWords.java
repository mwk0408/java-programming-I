
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s=scanner.nextLine();
            String[] temp=s.split(" ");
            if (s.equals("")) {
                break;
            }            
            System.out.println(temp[0]);
        }
    }
}
