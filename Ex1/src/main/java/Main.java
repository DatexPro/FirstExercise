import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(-9);
        array.add(8);
        array.add(5);
        array.add(-3);
        array.add(9);
        array.add(7);
        array.add(-5);
        int[] arr = {1, -5, 6, -9, 2, -1, 6, 8};
        FirstMethod firstMethod = new FirstMethod();
        SecondMethod secondMethod = new SecondMethod();
        System.out.println(firstMethod.methodArray1(array));
        System.out.println(Arrays.toString(secondMethod.methodArray2(arr)));

    }
}
