
import java.util.ArrayList;
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
    private JokeManager list;
    private Scanner scanner;
    public UserInterface(JokeManager list, Scanner scanner) {
        this.list=list;
        this.scanner=scanner;
    }
    public void start() {
        String command;
        String joke;
        while (true) {            
            printCommand();
            command=scanner.nextLine();
            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                joke=scanner.nextLine();
                this.list.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(this.list.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.list.printJokes();
            }
        }
    }
    public void printCommand()
    {
        System.out.println("Commands:\n" +
        "1 - add a joke\n" +
        "2 - draw a joke\n" +
        "3 - list jokes\n" +
        "X - stop");
    }
}
