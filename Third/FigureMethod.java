package com.company;

import java.util.List;

public class FigureMethod {
    public static void methodSort(List<Figure> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j - 1).getVolume() > list.get(j).getVolume()) {
                    list.add(j - 1, list.remove(j));
                }
            }
        }
        for (Figure i : list) {
            System.out.println(i.getClass() + " = " + i.getVolume());
        }
    }
}
