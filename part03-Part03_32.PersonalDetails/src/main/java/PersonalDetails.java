
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int count=0;
        int longest=0;
        String rec="";
        while (true) {
            String s=scanner.nextLine();
            String[] temp=s.split(",");
            if (s.equals("")) {
                System.out.println("Longest name: "+rec);               
                System.out.println("Average of the birth years: "+(1.0*total/count));
                break;
            }
            if (temp[0].length()>longest) {
                longest=temp[0].length();
                rec=temp[0];
            }
            total+=Integer.valueOf(temp[1]);
            count+=1;
        }
    }
}
