
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2=Integer.valueOf(scanner.nextLine());
        System.out.println(num+" + "+num2+" = "+(num+num2));
        System.out.println(num+" - "+num2+" = "+(num-num2));
        System.out.println(num+" * "+num2+" = "+(num*num2));
        System.out.println(num+" / "+num2+" = "+((num*1.0/num2)));

    }
}
