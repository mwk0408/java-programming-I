
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        String file=scanner.nextLine();
        System.out.println("Team:");
        String team=scanner.nextLine();
        int count=0;
        int win=0;
        int lose=0;
        int n;
        int index=0;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String[] temp=(scan.nextLine()).split(",");
                for (String string : temp) {
                    if (string.equals(team)) {
                        count+=1;
                        if (index==0) {
                            if (Integer.valueOf(temp[2])>Integer.valueOf(temp[3])) {
                                win+=1;
                            } else {
                                lose+=1;
                            }                            
                        } else if (index==1) {
                            if (Integer.valueOf(temp[2])>Integer.valueOf(temp[3])) {
                                lose+=1;
                            } else {
                                win+=1;
                            }
                        }
                    }
                    index+=1;
                }
                index=0;
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+file+" failed.");
        }
        System.out.println("Games: "+count);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+lose);
    }
}
