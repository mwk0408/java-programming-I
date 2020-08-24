
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> store=new ArrayList<>(); 
        System.out.println("Name of the file: ");
        String file=scanner.nextLine();
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String[] temp=(scan.nextLine()).split(",");
                System.out.println(temp[0]+", age: "+temp[1]+" years");
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+file+" failed.");
        }
    }
}
