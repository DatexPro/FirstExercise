
import java.util.*;

public class MethodString {
    public Object hashteg(Collection<String> str) throws Exception {
        try {
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            return 0;
        } finally {


            int count = 1;
            int value = 0;
            boolean q = false;
            Map<String, Integer> top5 = new TreeMap<String, Integer>();

            for (String strr : str) {
                if (strr != null && strr != "") {
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
                        }
                    }
                }
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(top5.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            if (list.size() >= 5) {
                return list.subList(0, 5);
            } else {
                return list;
            }

        }
    }
}