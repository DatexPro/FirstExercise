import java.util.ArrayList;
import java.util.Collections;

public class FirstMethod {

    public ArrayList<Integer> methodArray1(ArrayList<Integer> arr) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (int a : arr) {
            if (a >= 0) {
                arrayList1.add(a);
            }
        }
        Collections.sort(arrayList1);
        for (int i = arrayList1.size() - 1; i >= 0; i--) {
            arrayList2.add(arrayList1.get(i));
        }
        return arrayList2;
    }
}
