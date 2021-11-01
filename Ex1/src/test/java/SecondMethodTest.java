import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SecondMethodTest {
    SecondMethod secondMethod = new SecondMethod();
    Integer[] array1 = {};

    @Test
    void testMethodArray2_1() throws Exception {
        //first test
        //void array
        Integer[] array2 = {};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(array2)));
    }

    @Test
    void testMethodArray2_2() throws Exception {
        //second test
        //normal work
        Integer[] array2 = {-5, 5, 7};
        //actual
        array1 = new Integer[]{7, 5};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(array2)));
    }

    @Test
    void testMethodArray2_3() throws Exception {
        //third test
        //null on method
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(null)));
    }

    @Test
    void testMethodArray2_4() throws Exception {
        //forth test
        //only 0<n
        Integer[] mass = {7, 2, 5, 2, 4};
        //actual
        array1 = new Integer[]{7, 5, 4, 2, 2};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(mass)));
    }

    @Test
    void testMethodArray2_5() throws Exception {
        //forth test
        //only 0>n
        Integer[] mass = {-7, -2, -5, -2, -4};
        //actual
        array1 = new Integer[]{};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(mass)));
    }
    @Test
    void testMethodArray2_6() throws Exception {
        //six test
        //only 0
        Integer[] mass = {0, 0, 0};
        //actual
        array1 = new Integer[]{0, 0, 0};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(mass)));
    }
    @Test
    void testMethodArray2_7() throws Exception {
        //seven test
        //only 3
        Integer[] mass = {3, 3, 3, 3};
        //actual
        array1 = new Integer[]{3, 3, 3, 3};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(mass)));
    }
    @Test
    void testMethodArray2_8() throws Exception {
        //eight test
        //null on array
        Integer[] mass = {3, null, 3, 3};
        //actual
        array1 = new Integer[]{3, 3, 3};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(mass)));
    }
}