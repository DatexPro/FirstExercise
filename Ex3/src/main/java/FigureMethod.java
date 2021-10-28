import java.util.ArrayList;
import java.util.List;

public class FigureMethod {
    public static List<String> methodSort(List<Figure> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j - 1).getVolume() > list.get(j).getVolume()) {
                    list.add(j - 1, list.remove(j));
                }
            }
        }
        List<String> stringList =new ArrayList<>();
        for (Figure i : list) {
            stringList.add(i.getClass().toString() + " = " + i.getVolume());
        }
        return stringList;
    }
}