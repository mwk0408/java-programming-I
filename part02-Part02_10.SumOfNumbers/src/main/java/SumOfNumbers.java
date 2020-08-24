
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int n;
        while (true) {            
            System.out.println("Give a number:");
            n=Integer.valueOf(scanner.nextLine());
            if (n==0) {
                break;
            } else {                            
                count+=n;
            }
        }
        System.out.println("Sum of the numbers: "+count);
    }
}
