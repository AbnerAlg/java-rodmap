package operators;

public class Precedence {
    static void main(String[] args) {
        /*                 Order of Operations
            Here are some common operators, from highest to lowest priority:

            () - Parentheses
            *, /, % - Multiplication, Division, Modulus
            +, - - Addition, Subtraction
            >, <, >=, <= - Comparison
            ==, != - Equality
            && - Logical AND
            || - Logical OR
            = - Assignment

        * */
        int result1 = 2 + 3 * 4;     // 2 + 12 = 14
        int result2 = (2 + 3) * 4;   // 5 * 4 = 20

        System.out.println(result1);
        System.out.println(result2);

        int result3 = 10 - 2 + 5;    // (10 - 2) + 5 = 13
        int result4 = 10 - (2 + 5);  // 10 - 7 = 3

        System.out.println(result3);
        System.out.println(result4);
    }
}
