import java.util.Arrays;
import java.util.ArrayList;

public class ShuffleAlgorithm {
    public static void main (String[] args) {
        ArrayList<Integer> ArrayOne = addToArray(100);
        long startTime= System.nanoTime();
        shuffleArray(ArrayOne);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " ns");
    }

    public static ArrayList<Integer> shuffleArray(ArrayList<Integer> arrInt) {
        ArrayList<Integer> ArrayTwo = new ArrayList<Integer>();
        while (arrInt.size() > 0) {
            int random = (int) Math.floor(Math.random() * arrInt.size());
            int num = arrInt.get(random);
            arrInt.remove(random);
            ArrayTwo.add(num);
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

