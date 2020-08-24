
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do { 
            System.out.println("Give a number:");
            n=Integer.valueOf(scanner.nextLine());
            if (n<0) {
                System.out.println("Unsuitable number");
            } else if (n>0) {
                System.out.println(n*n);
            }
        } while (n!=0);
    }
}
