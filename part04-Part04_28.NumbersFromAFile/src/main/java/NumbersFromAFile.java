
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count=0;
        int temp;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                temp=Integer.valueOf(scan.nextLine());
                if (temp<=upperBound && temp >= lowerBound) {
                    count+=1;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+file+" failed.");
        }
        System.out.println("Numbers: "+count);
    }
}
