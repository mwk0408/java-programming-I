import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int smallest(int[] array){
        int smallest=array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest>array[i]) {
                smallest=array[i];
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==smallest(array)) {
                index=i;
                break;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest=array[startIndex];
        int index=startIndex;
        for (int i = startIndex+1; i < array.length; i++) {
            if (smallest>array[i]) {
                smallest=array[i];
                index=i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int index=indexOfSmallestFrom(array, i);
            swap(array, i, index);
        }
    }
}
