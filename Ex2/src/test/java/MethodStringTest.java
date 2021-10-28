import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodStringTest {
    MethodString s = new MethodString();
    List<String> list = new ArrayList<>();
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    String str1;
    String str2;
    String str3;
    String strs1;
    String strs2;
    String strs3;
    String strs4;
    @BeforeEach
    void setUp() {
        str1 = "This text has not heshteg";
        str2 = "This hes hesthegs #privat, #public, #protect, #public";
        str3 = "#public, and may be #String";
        list.add(str1);
    }

    @Test
    void testhashteg1() {
        //First test
        assertEquals(list1, s.hashteg(list));
    }

    @Test
    void testhashteg2() {
        //Second test
        list1.add(str2);
        strs1 = "1:#public=1";
        strs2 = "2:#protect=1";
        strs3 = "3:#privat=1";
        list2.add(strs1);
        list2.add(strs2);
        list2.add(strs3);
        assertEquals(list2, s.hashteg(list1));
    }

    @Test
    void testhashteg3() {
        //Third test
        list1.add(str2);
        list1.add(str3);
        strs1 = "1:#public=2";
        strs2 = "2:#protect=1";
        strs3 = "3:#privat=1";
        strs4 = "4:#String=1";
        list2.add(0,strs1);
        list2.add(strs2);
        list2.add(strs3);
        list2.add(strs4);
        assertEquals(list2, s.hashteg(list1));
    }
}