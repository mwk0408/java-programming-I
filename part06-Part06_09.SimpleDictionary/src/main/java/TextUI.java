
import java.util.Scanner;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner=scanner;
        this.dict=dict;
    }
    public void start() {
        String s;
        String word;
        String trans;
        while (true) {            
            System.out.print("Command: ");
            s=scanner.nextLine();
            if (s.equals("end")) {
                System.out.print("Bye bye!");
                break;
            } else if (s.equals("add")) {
                System.out.print("Word: ");
                word=scanner.nextLine();
                System.out.print("Translation: ");
                trans=scanner.nextLine();
                this.dict.add(word,trans);
            } else if (s.equals("search")) {
                System.out.print("To be translated: ");
                word=scanner.nextLine();
                if (this.dict.translate(word)==null) {
                    System.out.println("Word "+word+" was not found");
                } else {
                    System.out.println("Translation: "+this.dict.translate(word));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
