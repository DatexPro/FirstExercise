import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SecondMethodTest {
    SecondMethod secondMethod = new SecondMethod();
    int a;
    int[] array1 = {};

    @Test
    void testMethodArray2_1() {
        int[] array2 = {};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(array2)));
    }

    @Test
    void testMethodArray2_2() {
        int[] array2 = {-5, 5, 7};
        array1 = new int[]{7, 5};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(array2)));
    }

    @Test
    void testMethodArray2_3() {
        int[] array2 = {0, -2, -1};
        array1 = new int[]{0};
        assertEquals(Arrays.toString(array1), Arrays.toString(secondMethod.methodArray2(array2)));

    }
}