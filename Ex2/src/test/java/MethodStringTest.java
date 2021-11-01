import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodStringTest {
    MethodString s = new MethodString();
    List<String> list = new ArrayList<>();

    @Test
    void testhashteg1() {
        //First test
        //String hasn`t heshteg
        List<String> list1 = new ArrayList<>();
        String str1 = "This text has not heshteg";
        list.add(str1);
        try {
            assertEquals(list1, s.hashteg(list));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testhashteg2() throws Exception {
        //Second test
        //null on method
        List<String> list1 = new ArrayList<>();
        assertEquals(list1, s.hashteg(null));
    }

    @Test
    void testhashteg3() throws Exception {
        //Third test
        //void list
        List<String> list1 = new ArrayList<>();
        assertEquals(list1, s.hashteg(list));
    }

    @Test
    void testhashteg4() throws Exception {
        //Four test
        //String hes heshtegs
        String s1 = "#pruf this is hes #hesteg, #string";
        List<String> list1 = new ArrayList<>();
        String a1 = "#hesteg=1";
        String a2 = "#pruf=1";
        String a3 = "#string=1";
        list1.add(a1);
        list1.add(a2);
        list1.add(a3);
        list.add(s1);
        assertEquals(list1.toString(), s.hashteg(list).toString());
    }
    @Test
    void testhashteg5()throws Exception{
        //five test
        //heshteg on ceter word
        String s1 = "pr#uf this is hes";
        List<String> list1 = new ArrayList<>();
        list.add(s1);
        assertEquals(list1, s.hashteg(list));
    }
    @Test
    void testhashteg6()throws Exception{
        //six test
        //null on list
        String s1 = "pr#uf #prud this is hes";
        List<String> list1 = new ArrayList<>();
        String a1 ="#prud=1";
        list1.add(a1);
        list.add(s1);
        list.add(null);
        assertEquals(list1.toString(), s.hashteg(list).toString());
    }
    @Test
    void testhashteg7()throws Exception{
        //seven test
        //some String with hesteg
        String s1 = "pr#uf #prud this is hes";
        String s2 = "#prud #someone this is #word";
        List<String> list1 = new ArrayList<>();
        list1.add("#prud=2");
        list1.add("#someone=1");
        list1.add("#word=1");
        list.add(s1);
        list.add(s2);
        assertEquals(list1.toString(), s.hashteg(list).toString());
    }
    @Test
    void testhashteg8()throws Exception{
        //eight test
        //void String
        String s1 = "";
        String s2 = "#stream";
        List<String> list1 = new ArrayList<>();
        list1.add(s2+"=1");
        list.add(s1);
        list.add(s2);
        assertEquals(list1.toString(), s.hashteg(list).toString());
    }
}