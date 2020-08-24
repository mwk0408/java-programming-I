
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int compare=0;
        String rec="";
        while (true) {
            String s=scanner.nextLine();
            String[] temp=s.split(",");
            if (s.equals("")) {
                System.out.println("Age of the oldest: "+rec);
                break;
            }            
            if (Integer.valueOf(temp[1])>compare) {
                compare=Integer.valueOf(temp[1]);
                rec=temp[0];
            }
        }
    }
}
