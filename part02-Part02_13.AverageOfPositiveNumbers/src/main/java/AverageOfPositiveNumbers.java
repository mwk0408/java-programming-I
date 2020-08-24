
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int total=0;
        int n;
        while (true) {            
            System.out.println("Give a number:");
            n=Integer.valueOf(scanner.nextLine());
            if (n==0) {
                break;
            } else if (n>0) {                            
                count+=1;
                total+=n;
            }
        }
        if (count==0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: "+(1.0*total/count));
        }
    }
}
