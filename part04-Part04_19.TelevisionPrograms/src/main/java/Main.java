import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String s;
        int num;
        while (true) {            
            System.out.println("Name: ");
            s=scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }
            System.out.println("Duration:");
            num=Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(s, num));
        }
        System.out.println("Program's maximum duration? ");
        int limit=Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration()<=limit) {
                System.out.println(program);
            }
        }
    }
}
