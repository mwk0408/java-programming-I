
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean flag=false;
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        String temp;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                temp=scan.nextLine();
                if (temp.contains(searchedFor)) {
                    flag=true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+file+" failed.");
        }
        if (flag) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
