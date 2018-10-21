public class Casting {
    public static void main(String[] args) {

        double d = 4.45;
        short s = 8;
        int i;

        i = s;

        System.out.println(i);

        Employee emp = new Employee();
        VicePresident veep = new VicePresident();

        emp = veep;  // to rozkminic jak dziala
        veep = (VicePresident) emp;  //to rozkmiinc jak dziala


        Float f1 = 4.24F;
        Float f2 = 6.34F;

        System.out.println(Math.min(f1,f2));
    }



}


class Employee{}

class VicePresident extends Employee{}