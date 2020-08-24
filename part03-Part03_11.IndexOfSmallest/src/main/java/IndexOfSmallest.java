
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int temp;
        while (true) { 
            temp=Integer.valueOf(scanner.nextLine());
            if (temp==9999) {
                break;
            }
            list.add(temp);
        }
        int compare=list.get(0);
        int check;
        for (int i = 0; i < list.size(); i++) {
            check=list.get(i);
            if (check<compare) {
                compare=check;
            }
        }
        System.out.println("Smallest number: "+compare);
        for (int i = 0; i < list.size(); i++) {
            if (compare==list.get(i)) {
                System.out.println("Found at index: "+i);
            }
        }
    }
}
