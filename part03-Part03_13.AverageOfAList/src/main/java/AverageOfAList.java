
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                for (Integer integer : list) {
                    sum+=integer;
                }
                break;
            }

            list.add(input);
        }

        System.out.println("Average: "+(1.0*sum/list.size()));       
    }
}
