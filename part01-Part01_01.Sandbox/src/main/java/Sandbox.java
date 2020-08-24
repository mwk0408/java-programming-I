import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Poker poker= new Poker("6S 8S 7S 5H 9H");
        poker.sort();
        System.out.println(poker.getValue());
        System.out.println(poker.getSuit());
        System.out.println(poker.pairs());
        System.out.println(poker.isStraight());
        System.out.println(poker.finalTest(new Poker("6S 8S 7S 5H 9H")));
    }
}
