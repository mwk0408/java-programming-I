
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        String s;
        while (true) {
            s=scanner.nextLine();
            if (s.equals("end")) {
                System.out.println(count);
                break;
            }
            count+=1;
        }
    }
}
