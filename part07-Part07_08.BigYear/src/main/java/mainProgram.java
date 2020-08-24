
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        bird birdlist=new bird();
        String command;
        String name;
        String latinName;
        boolean flag;
        while (true) {            
            System.out.print("? ");
            command=scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                name=scan.nextLine();
                birdlist.addName(name);
                System.out.print("Name in Latin: ");
                latinName=scan.nextLine();
                birdlist.addLatinName(latinName);
                birdlist.addCount();
            } else if (command.equals("All")) {
                birdlist.printString();
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                name=scan.nextLine();
                flag=birdlist.observation(name);
                if (!flag) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                name=scan.nextLine();
                birdlist.printOne(name);
            }
        }
    }

}
