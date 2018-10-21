public class Lab322 {
    public static void main(String[] args) {

    Book gazeta = new Book();
    gazeta.depth = 12;
    gazeta.weight = 13;
    gazeta.height = 14;

        System.out.println("wymiary obiektu to: " + gazeta.depth + " x " + gazeta.weight + " x " + gazeta.height);

    }
}


class Book {
    int height;
    int weight;
    int depth ;
}