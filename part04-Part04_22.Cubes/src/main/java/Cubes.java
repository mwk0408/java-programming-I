
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int cube;
        while (true) {
            s=scanner.nextLine();
            if (s.equals("end")) {
                break;
            }
            cube=Integer.valueOf(s);
            System.out.println(cube*cube*cube);
        }
    }
}
