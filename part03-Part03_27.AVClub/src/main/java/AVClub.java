
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s=scanner.nextLine();
            String[] temp=s.split(" ");
            if (s.equals("")) {
                break;
            }            
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].contains("av")) {
                    System.out.println(temp[i]);
                }
            }            
        }
    }
}
