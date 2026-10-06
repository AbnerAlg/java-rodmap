package data_types;

public class Var {
    static void main(String[] args) {
        // The var lets compiler automatically detect the type of a variable
        var x = 5;
        System.out.println(x); // x is an int

        // Example with a diferent types
        var myNum = 5;         // int
        var myDouble = 9.98;   // double
        var myChar = 'D';      // char
        var myBoolean = true;  // boolean
        var myString = "Hello"; // String

        // Important Notes:
        /*  1. var only works when you assign a value at the same time
        *   2. Once the type is chosen, it stays the same */

        // WHEN TO USE var?
        // For simple variables and not for more complex types

        // Without var
        //      ArrayList<String> cars = new ArrayList<String>();

        // With var
        //      var cars = new ArrayList<String>();
    }
}
