public class Lab31c {
    public static void main(String[] args) {

        int a = 14;

        System.out.println("Będziemy wyświetlać w innych systemach niż dziesiętny leczbę: " + a);

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));
    }
}
