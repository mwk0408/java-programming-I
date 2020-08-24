
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("File to read: \n");
        String name=scan.nextLine();
        food f=new food();
        recipe r=new recipe();
        try (Scanner scanner = new Scanner(Paths.get(name))) {
            while (scanner.hasNextLine()) {
                String row=scanner.nextLine();
                if (row.isEmpty()) {
                    r.add(f);
                    System.out.println(f.size());
                    f=new food();
                } else {
                    f.add(row);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        r.add(f);
        String command;
        String foodName;
        String ingredient;
        int time;
        while (true) {            
            System.out.println("Commands:");
            System.out.println("list - lists the recipes\n" +
            "stop - stops the program");
            System.out.println("");
            System.out.print("Enter command: ");
            command=scan.nextLine();
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                r.printAll();
                System.out.println("");
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                foodName=scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                r.findName(foodName);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                time=Integer.valueOf(scan.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                r.findTime(time);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient:  ");
                ingredient=scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                r.findIngredient(ingredient);
            }
        }
    }
}
