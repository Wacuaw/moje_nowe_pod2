public class Binary {
    public static void main(String[] args) {

//        & - iloczyn bitowy
//        | - suma bitowa
//        ^ - XOR (eXclusive OR)
//        ~~ - negacja bitowa
//        << przesunięcie w lewo
//        >> przesunięcie w prawo

//        1 1 -> 1
//        0 1 -> 0
//        0 0 -> 0
//

        int b = 5;
        int a = 6;
        int c = calculate(a, b);


        show(a, b, c);

        System.out.println("negacja 5:  " + (~5));

    }

//        System.out.println("liczba dziesiętna:  " + i);
//        System.out.println("binarny ; " + Integer.toBinaryString(i));
//        System.out.println("szesnastkowy ; " + Integer.toHexString(i));
//        System.out.println("ósemkowy ; " + Integer.toOctalString(i));






    static void show (int a, int b, int c){
        System.out.println("operacja: " + a + "^" + b + " = " + c );
        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("------------------");
        System.out.printf("%10s\n", Integer.toBinaryString(a^b));
        System.out.println(c);
    }




    static int calculate (int a, int b){
        return a ^ b;
    }



}
