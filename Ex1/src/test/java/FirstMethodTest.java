import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FirstMethodTest {
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    FirstMethod firstMethod = new FirstMethod();
    int a1;
    int a2;
    int a3;

    @BeforeEach
    void setUp() {
        a1 = 5;
        a2 = -3;
        a3 = 1;
    }

    @Test
    void testMethodArray1() {
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(a2);
        assertEquals(array1, firstMethod.methodArray1(array2));
    }

    @Test
    void testMethodArray2() {
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array1.add(a1);
        array1.add(a2);
        array1.add(a3);
        array2.add(5);
        array2.add(1);
        assertEquals(array2, firstMethod.methodArray1(array1));
    }

    @Test
    void testMethodArray3() {
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(a2);
        array2.add(0);
        array2.add(-1);
        array1.add(0);
        assertEquals(array1, firstMethod.methodArray1(array2));
    }
}