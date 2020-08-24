
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int compare=0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s=scanner.nextLine();
            String[] temp=s.split(",");
            if (s.equals("")) {
                System.out.println("Age of the oldest: "+compare);
                break;
            }            
            if (Integer.valueOf(temp[1])>compare) {
                compare=Integer.valueOf(temp[1]);
            }
        }
    }
}
