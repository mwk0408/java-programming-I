
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int max;
        if (number1>number2) {
            max=number1;
        } else {
            max=number2;
        }
        if (number3>max) {
            max=number3;
        }
        return max;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
