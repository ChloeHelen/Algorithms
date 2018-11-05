import java.util.Arrays;

public class LastTiming {

    private static int[] arrayOne = new int[] {1,2,3};

    public static void main (String[] args) {
        long startTime= System.nanoTime();
        int number = last(arrayOne);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns");
    }

    public static int last(int[] arr) {
        return arr[arr.length - 1];
    }
}