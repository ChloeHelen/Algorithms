import java.util.Arrays;
import java.util.ArrayList;

public class ReverseAlgorithm {

    public static void main (String[] args) {
        ArrayList<Integer> ArrayOne = addToArray(100);
        long startTime= System.nanoTime();
        reverseArray(ArrayOne);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns");

    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arrInt) {
        ArrayList<Integer> ArrayTwo = new ArrayList<Integer>();
        while (!arrInt.isEmpty()) {
            ArrayTwo.add(arrInt.get(arrInt.size() - 1));
            arrInt.remove(arrInt.get(arrInt.size() - 1));
        }
        return ArrayTwo;
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
}