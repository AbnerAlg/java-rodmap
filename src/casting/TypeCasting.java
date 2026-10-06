package casting;

public class TypeCasting {
    static void main(String[] args) {
        // Type casting means converting one data type into another

        /* Are two main types of casting
        *   1. Widening Casting(Automatic)
        *   2. Narrowing Casting(Manual)
        * */

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);   //Outputs 9
        System.out.println(myDouble);  //Outputs 9.0

        // Narrowing Casting
        double myDouble2 = 9.76d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);
        System.out.println(myInt2);


    }
}
