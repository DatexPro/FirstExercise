
import java.util.*;

public class MethodString {
    public List hashteg(List<String> str) {
        int count = 1;
        int value = 0;
        boolean q = false;
        Map<String, Integer> top5 = new TreeMap<String, Integer>();
        for (String strr : str) {
            List<String> strings = Arrays.asList(strr.split(", |,| |\\s"));
            Set<String> stringSet = new HashSet<String>(strings);
            for (String a : stringSet) {
                if (a.charAt(0) == '#') {
                    q = top5.containsKey(a);
                    if (q) {
                        value = top5.get(a) + 1;
                        top5.put(a, value);
                    } else {
                        top5.put(a, count);
                    }
                } else {
                    continue;
                }
            }
        }
        //System.out.println(top5);
        List list = new ArrayList(top5.entrySet());
        return getTop5(list);
    }
    public List getTop5(List list){
        List l = new ArrayList();
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        //System.out.println("TOP 5");
        int count =1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.size()>=5){
                if(list.size()-6==i){
                    break;
                }
            }
            l.add(count+":"+list.get(i));
            count++;
        }
        return l;
    }
}