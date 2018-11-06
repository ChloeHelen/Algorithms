import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseTiming {

    public static void main (String[] args) {
        ArrayList<Integer> ArrayOne = addToArray(1000);
        long startTime= System.nanoTime();
        Collections.reverse(ArrayOne);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns");
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