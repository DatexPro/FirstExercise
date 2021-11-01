import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FirstMethodTest {

    FirstMethod firstMethod = new FirstMethod();
    ArrayList<Integer> array1 = new ArrayList<Integer>();

    @Test
    void testMethodArray1() {
        //first test
        //void list
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        assertEquals(array1, firstMethod.methodArray1(array2));
    }

    @Test
    void testMethodArray2() {
        //second test
        //null on method
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        assertEquals(array2, firstMethod.methodArray1(null));
    }

    @Test
    void testMethodArray3() {
        //third test
        //only 0<n
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(2);
        array2.add(1);
        array2.add(4);
        //actual
        array1.add(4);
        array1.add(2);
        array1.add(1);

        assertEquals(array1, firstMethod.methodArray1(array2));
    }
    @Test
    void testMethodArray4(){
        //four test
        //only 0>n
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(-2);
        array2.add(-1);
        array2.add(-4);
        assertEquals(array1, firstMethod.methodArray1(array2));
    }
    @Test
    void testMethodArray5(){
        //five test
        //only 0
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(0);
        array2.add(0);
        array2.add(0);
        //actual
        array1.add(0);
        array1.add(0);
        array1.add(0);
        assertEquals(array1, firstMethod.methodArray1(array2));
    }
    @Test
    void testMethodArray6(){
        //six test
        //only 5
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(5);
        array2.add(5);
        array2.add(5);
        //actual
        array1.add(5);
        array1.add(5);
        array1.add(5);
        assertEquals(array1, firstMethod.methodArray1(array2));
    }
    @Test
    void testMethodArray7(){
        //seven test
        //normal work
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(-5);
        array2.add(4);
        array2.add(0);
        //actual
        array1.add(4);
        array1.add(0);
        assertEquals(array1, firstMethod.methodArray1(array2));
    }
    @Test
    void testMethodArray8(){
        //eight test
        //null on array
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(null);
        array2.add(5);
        array2.add(5);
        //actual
        array1.add(5);
        array1.add(5);
        assertEquals(array1, firstMethod.methodArray1(array2));
    }
}