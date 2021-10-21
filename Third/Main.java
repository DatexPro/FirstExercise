package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Figure cube = new Cube(8);
        Figure sphere = new Sphere(12);
        Figure cylinder = new Сylinder(7, 4);
        List<Figure> figures = new ArrayList<>();
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        FigureMethod.methodSort(figures);
    }
}
