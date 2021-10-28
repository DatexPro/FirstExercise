import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str1 = "This is realy cool #party every #shop, body " +
                "#shop lets go party #music, arc#men, #music, #shot, #shot";
        String str2 = "I #ligth, #party, hello my world I #like it, #shop, #like, liketime";
        String str3 = "This #ligth, #shop, #shop, #shop #party, #party";
        String str4 ="Its my life #music #itsmylife, #like";
        String str5 ="#music party, #like, #shot, #shop";
        List<String> stringList = new ArrayList<>();
        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);
        stringList.add(str4);
        stringList.add(str5);

        MethodString methodString = new MethodString();
        System.out.println(methodString.hashteg(stringList));
    }
}
