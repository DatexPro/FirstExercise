import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FigureMethodTest {
    Figure cube;
    Figure sphere;
    Figure cylinder;
    List<Figure> figures = new ArrayList<>();
    Cube c;
    Sphere s;
    Сylinder cy;
    @Test
    void testMethodSort1() {
        cube = new Cube(0);
        sphere = new Sphere(0);
        cylinder = new Сylinder(0,0);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        List<String> stringList =new ArrayList<>();
        stringList.add(cube.getFigure());
        stringList.add(sphere.getFigure());
        stringList.add(cylinder.getFigure());
        Assertions.assertEquals(stringList, FigureMethod.methodSort(figures));
    }

    @Test
    void testMethodSort2() {
        cube = new Cube(0);
        sphere = new Sphere(15);
        cylinder = new Сylinder(4,3);
        figures.add(cube);
        figures.add(cylinder);
        figures.add(sphere);
        List<String> stringList =new ArrayList<>();
        stringList.add(cube.getFigure());
        stringList.add(cylinder.getFigure());
        stringList.add(sphere.getFigure());
        Assertions.assertEquals(stringList, FigureMethod.methodSort(figures));
    }
    @Test
     void testMethodSort3() {
        cube = new Cube(null);
        sphere = new Sphere(1);
        cylinder = new Сylinder(4,3);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        List<String> stringList =new ArrayList<>();
        stringList.add(cube.getFigure());
        stringList.add(sphere.getFigure());
        stringList.add(cylinder.getFigure());

        Assertions.assertEquals(stringList, FigureMethod.methodSort(figures));
    }
    @Test
    void testMethodSort4() {
        cube = new Cube(6);
        sphere = new Sphere(null);
        cylinder = new Сylinder(null,4);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        List<String> stringList =new ArrayList<>();
        stringList.add(sphere.getFigure());
        stringList.add(cylinder.getFigure());
        stringList.add(cube.getFigure());
        Assertions.assertEquals(stringList, FigureMethod.methodSort(figures));
    }
    @Test
    void testMethodSort5() {
        cube = new Cube(-3);
        sphere = new Sphere(-3);
        cylinder = new Сylinder(-7,4);
        figures.add(cube);
        figures.add(sphere);
        figures.add(cylinder);
        List<String> stringList =new ArrayList<>();
        stringList.add(sphere.getFigure());
        stringList.add(cube.getFigure());
        stringList.add(cylinder.getFigure());
        Assertions.assertEquals(stringList, FigureMethod.methodSort(figures));
    }
    @Test
    void testMathMethod1(){
        double c1 = 8;
        double s1 = 267.94666666666666;
        double cy1 = 37.68;
        c = new Cube(2);
        s = new Sphere(4);
        cy = new Сylinder(2,3);
        Assertions.assertEquals(c1, c.getVolume());
        Assertions.assertEquals(s1,s.getVolume());
        Assertions.assertEquals(cy1,cy.getVolume());
    }
    @Test
    void testMathMethod2(){
        double c1 = 8;
        double s1 = 0;
        double cy1 = 0;
        c = new Cube(2);
        s = new Sphere(null);
        cy = new Сylinder(null,3);
        Assertions.assertEquals(c1, c.getVolume());
        Assertions.assertEquals(s1,s.getVolume());
        Assertions.assertEquals(cy1,cy.getVolume());
    }
    @Test
    void testMathMethod3(){
        double c1 = -216;
        double s1 = 0;
        double cy1 = 0;
        c = new Cube(-6);
        s = new Sphere(0);
        cy = new Сylinder(-2,0);
        Assertions.assertEquals(c1, c.getVolume());
        Assertions.assertEquals(s1,s.getVolume());
        Assertions.assertEquals(cy1,cy.getVolume());
    }
    @Test
    void testMathMethod4(){
        double c1 = 0;
        double s1 = -113.04;
        double cy1 = 37.68;
        c = new Cube(null);
        s = new Sphere(-3);
        cy = new Сylinder(-2,3);
        Assertions.assertEquals(c1, c.getVolume());
        Assertions.assertEquals(s1,s.getVolume());
        Assertions.assertEquals(cy1,cy.getVolume());
    }
}