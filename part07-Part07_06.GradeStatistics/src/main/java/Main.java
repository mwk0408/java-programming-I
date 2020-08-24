
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        gradeStat result=new gradeStat();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {            
            num=Integer.valueOf(scanner.nextLine());
            if (num==-1) {
                break;
            }
            result.add(num);
        }
        if (result.average()==-1.0) {
            System.out.println("Point average (all): -");
        } else {
            System.out.println("Point average (all): "+result.average());
        }
        if (result.passingAverage()==-1.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): "+result.passingAverage());
        }
        if (result.passingPercent()==-1.0) {
            System.out.println("Pass percentage: -");
        } else {
            System.out.println("Pass percentage: "+result.passingPercent());
        }
        System.out.println("Grade distribution:");
        result.printGrade();
    }
}
