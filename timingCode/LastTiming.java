import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class LastTiming {

    public static void main (String[] args) {
        ArrayList<Integer> arrayOne = addToArray(1000);
        ArrayList<Long> resultsArray = new ArrayList<Long>();
        int x = 1;
        while (x < 101) {
            long startTime= System.nanoTime();
            int number = last(arrayOne);
            long endTime = System.nanoTime();
            resultsArray.add(endTime - startTime);
            x ++;
        }
        System.out.println(averageArray(resultsArray));
    }

    public static int last(ArrayList<Integer> arr) {
        return arr.get(arr.size() - 1);
    }

    public static ArrayList<Integer> addToArray(int times){
        ArrayList<Integer> arrayOne = new ArrayList<Integer>();
        int x = 1;
        while (x <= times) {
            arrayOne.add(x);
            x++;
        }
        return arrayOne;
    }

    public static long averageArray(ArrayList<Long> arr) {
        int i;
        long sum = 0;
        for(i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return (sum / (arr.size()));

    }
}