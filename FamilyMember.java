public class FamilyMember {

    static String surname = "Nowak";
    String name;
    int age;


    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.age = 27;
        dad.name = "Jan";

        FamilyMember mum = new FamilyMember();
        mum.age = 25;
        mum.name = "Agata";

        FamilyMember.surname = "Kowalski";

        System.out.println("Tata: " + dad.name + "\t" + FamilyMember.surname + " " + dad.age + " lat");
        System.out.println("mama: " + mum.name + "\t" + FamilyMember.surname + " " + mum.age + " lat");

        System.out.println(Math.max(41224123,124523123));

        int i = 41224127;
        String str = String.valueOf(i);

        System.out.println(str.charAt(2));
    }
}
