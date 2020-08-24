/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
import java.util.Scanner;
public class UI {
    private Container first;
    private Container second;
    private Scanner scan;
    public UI() {
        this.first=new Container();
        this.second=new Container();
        this.scan=new Scanner(System.in);
    }
    public void start() {
        while (true) {                      
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                int amount = Integer.valueOf(parts[1]);
                first.add(amount);
            } else if (command.equals("move")) {
                int move = Integer.valueOf(parts[1]);
                if (move>first.contains()) {
                    second.add(first.contains());
                    first.remove(move);
                } else {
                    first.remove(move);
                    second.add(move);
                }
            } else if (command.equals("remove")) {
                int remove = Integer.valueOf(parts[1]);
                second.remove(remove);
            }
        }
    }
}
