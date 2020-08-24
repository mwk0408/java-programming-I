
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int n;
        while (true) {            
            System.out.println("Give a number:");
            n=Integer.valueOf(scanner.nextLine());
            if (n==0) {
                break;
            } else if (n<0) {                            
                count+=1;
            }
        }
        System.out.println("Number of negative numbers: "+count);
    }
}
