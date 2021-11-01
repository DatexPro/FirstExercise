import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstMethod {

    public List<Integer> methodArray1(ArrayList<Integer> arr) {
        if (arr != null) {
            List<Integer> arrayList1 = new ArrayList<Integer>();
            for (Integer a : arr) {
                if (a != null) {
                    if (a >= 0) {
                        arrayList1.add(a);
                    }
                }
            }
            Collections.sort(arrayList1);
            Collections.reverse(arrayList1);
            return arrayList1;
        } else {
            List<Integer> List = new ArrayList<Integer>();
            return List;
        }
    }
}
