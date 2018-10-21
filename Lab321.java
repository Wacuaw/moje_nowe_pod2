import java.util.StringTokenizer;

public class Lab321 {
    public static void main(String[] args) {

        String data = "29/10/1990";

        StringTokenizer nowaData;

        nowaData = new StringTokenizer(data, "/");

        System.out.println("urodziłem się dnia  \t\t" + nowaData.nextToken());
        System.out.println("urodziłem się w miesiącu  \t" + nowaData.nextToken());
        System.out.println("urodziłem się w roku  \t\t" + nowaData.nextToken());

    }
}
