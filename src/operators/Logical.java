package operators;

public class Logical {
    static void main(String[] args) {
        // As with comparison operators, you can also test for true or false

        int x = 5;

        System.out.println(x > 3 && x < 10);  // returns true because 5 is greather tan 3 and 5 is less than 10
        System.out.println(x > 2 || x < 10); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result

        // Real life: Login Check
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}
