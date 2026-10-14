package strings;

public class Strings {
    static void main(String[] args) {
        // Strings are used for storing text actually is an object
        String greeting = "Hello";

        // String length
        // A String in Java is actually an object, which means it contains methods that can perform certain operations on strings.
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        /*     More String Methods
            The toUpperCase() method converts a string to upper case letters.
            The toLowerCase() method converts a string to lower case letters.
        */

        String hi = "Hello World";
        System.out.println(hi.toUpperCase());  // Outputs "HELLO WORLD"
        System.out.println(hi.toLowerCase());  // Outputs "hello world"

        // Finding a Character in a String
        // indexOf() method returns the index (the position) including whitespace
        String txt1 = "Please locate where 'locate' occurs! ";
        System.out.println(txt1.indexOf("locate")); // Position 7

        // You can use the charAt() method to access a character at a specific position in a string:
        String txt3 = "Hello";
        System.out.println(txt3.charAt(0));  // Print H
        System.out.println(txt3.charAt(4));  // Print o

        // Comparing Strings .equals()
        String txt2 = "Hello";
        String txt4 = "Hello";

        String txt5 = "hello world";
        String txt6 = "Hello World";

        System.out.println(txt2.equals(txt4)); // true
        System.out.println(txt5.equals(txt6)); //False


        // Removing space .trim()
        String text = "         Hello         ";
        System.out.println("Before: ["+text +"]");
        System.out.println("After: ["+text.trim()+"]");


    }
}
