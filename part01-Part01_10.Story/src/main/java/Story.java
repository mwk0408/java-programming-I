
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String text=scanner.nextLine();
        System.out.println("What is their job?");
        String text2=scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+text+", who was "+text2+".");
        System.out.println("On the way to work, "+text+" reflected on life.");
        System.out.println("Perhaps "+text+" will not be "+text2+" forever.");

    }
}
