
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0;
        int second=0;
        int limit=100;
        while (true) {
            System.out.println("First: "+first+"/"+limit);
            System.out.println("Second: "+second+"/"+limit);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                int amount = Integer.valueOf(parts[1]);
                if (amount>=0) {
                    if (first+amount>limit) {
                        first=limit;
                    } else {
                        first+=amount;
                    }
                }   
            } else if (command.equals("move")) {
                int move = Integer.valueOf(parts[1]);
                if (move>=0) {
                    if (move>first) {
                        second+=first;
                        first=0;
                    } else {
                        first-=move;
                        second+=move;
                    }
                }
                if (second>limit) {
                    second=limit;
                }
            } else if (command.equals("remove")) {
                int remove = Integer.valueOf(parts[1]);
                if (remove>=0) {
                    if (remove>second) {
                        second=0;
                    } else {
                        second-=remove;
                    }
                }
            }
        }
    }
}
