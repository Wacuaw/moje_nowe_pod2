import java.util.StringTokenizer;

public class StringChecker {
    public static void main(String[] args) {

        String str = "Lannister zawsze spłąca swoje długi.";

        System.out.println("Tekst to:  "+ str);
        System.out.println("Długość tekstu:   "+str.length());
        System.out.println("Znak na pozycji 6.:  " + str.charAt(6));
        System.out.println("Fragment od 10. do 16.: >>" + str.substring(10,16)+"<<");
        System.out.println("indeks pierwszej litery 't' : " + str.indexOf('t'));
        System.out.println("indeks pierwszego podtekstu \"długi\":   " + str.indexOf("długi"));
        System.out.println("wszystko dużymi: " + str.toUpperCase() );

    }
}
