
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int n=Integer.valueOf(scan.nextLine());
        if (n>100) {
            System.out.println("incredible!");
        } else if (n>=90) {
            System.out.println("5");
        } else if (n>=80) {
            System.out.println("4");
        } else if (n>=70) {
            System.out.println("3");
        } else if (n>=60) {
            System.out.println("2");
        } else if (n>=50) {
            System.out.println("1");
        } else if (n>=0) {
            System.out.println("failed");
        } else {
            System.out.println("impossible!");
        }
    }
}
