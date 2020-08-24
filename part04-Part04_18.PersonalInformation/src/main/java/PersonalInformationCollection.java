
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String last;
        String first;
        String num;
        while (true) {
            System.out.println("First name: ");
            first=scanner.nextLine();
            if (first.isEmpty()) {
                break;
            }
            System.out.println("Last name: ");
            last=scanner.nextLine();
            System.out.println("Identification number: ");
            num=scanner.nextLine();
            infoCollection.add(new PersonalInformation(first, last, num));
        }
        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName()+" "+personalInformation.getLastName());
        }
    }
}
