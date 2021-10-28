import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FigureMethodTest {
    Figure cube;
    Figure sphere;
    Figure cylinder;
    List<Figure> figures = new ArrayList<>();

    @BeforeEach
    void setUp() {
        cube = new Cube(0);
        sphere = new Sphere(0);
        cylinder = new Сylinder(0,0);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
    }

    @Test
    void testMethodSort1() {
        List<String> stringList =new ArrayList<>();
        for (Figure i : figures) {
            stringList.add(i.getClass().toString() + " = " + i.getVolume());
        }
        Assertions.assertEquals(stringList, FigureMethod.methodSort(figures));
    }

    @Test
    void testMethodSort2() {
        cube = new Cube(2);
        sphere = new Sphere(9);
        cylinder = new Сylinder(4,3);
        figures.add(cube);

        figures.add(cylinder);
        figures.add(sphere);
        List<String> stringList =new ArrayList<>();
        for (Figure i : figures) {
            stringList.add(i.getClass().toString() + " = " + i.getVolume());
        }
        Assertions.assertEquals(stringList, FigureMethod.methodSort(figures));
    }
}