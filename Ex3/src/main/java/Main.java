import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Figure cube = new Cube(8);
        Figure sphere = new Sphere(5);
        Figure cylinder = new Сylinder(7, 4);
        List<Figure> figures = new ArrayList<>();
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        System.out.println(FigureMethod.methodSort(figures));
    }
}

