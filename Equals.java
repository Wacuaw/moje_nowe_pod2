public class Equals {


    public static void main(String[] args) {


        String str1, str2;

        str1 = new String ("to jest jakis teks");
        str2 = new String ("to jest jakis teks");
        if (str1.equals(str2)) {
            System.out.println("równe");
        }

        A a = new A();
        B b = new B();

        if (a.equals(b)){
            System.out.println("klasy sa równe");
        }
    }
}


class A {}
class B {}