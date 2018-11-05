import java.util.Arrays;

public class LastTiming {
    public static void main (String[] args) {
        int[] arrayOne = new int[] {1,2,3};
        int number = last(arrayOne);
        System.out.println(number);
    }

    public static int last(int[] arr) {
        return arr[arr.length - 1];
    }
}