
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    public UserInterface(TodoList list, Scanner scanner) {
        this.list=list;
        this.scanner=scanner;
    }
    public void start() {
        String command;
        String element;
        int i;
        while (true) {            
            System.out.print("Command: ");
            command=scanner.nextLine();
            if (command.equals("add")) {
                System.out.print("To add: ");
                element=scanner.nextLine();
                list.add(element);
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                i=Integer.valueOf(scanner.nextLine());
                list.remove(i);
            }
        }
    }
}
