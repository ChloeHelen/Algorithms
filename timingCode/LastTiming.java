import java.util.Arrays;
import java.util.ArrayList;

public class LastTiming {

    public static void main (String[] args) {
        ArrayList<Integer> arrayOne = addToArray(10000);
        long startTime= System.nanoTime();
        int number = last(arrayOne);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns");
    }

    public static int last(ArrayList<Integer> arr) {
        return arr.get(arr.size() - 1);
    }

    public static ArrayList<Integer> addToArray(int times){
        ArrayList<Integer> arrayOne = new ArrayList<Integer>();
        int x = 1;
        while (x <= times) {
            arrayOne.add(1);
            x++;
        }
        return arrayOne;
    }
}