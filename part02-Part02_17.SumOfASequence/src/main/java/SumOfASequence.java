
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int num=Integer.valueOf(scanner.nextLine());
        System.out.println("The sum is "+(num*(num+1))/2);
    }
}
