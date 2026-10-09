package operators;

public class Comparison {
    static void main(String[] args) {
        // Are used to compare two values (or variables)

        // greater than (>)
        int x = 6;
        int y = 7;

        System.out.println(x > y);  // returns false because 6 is less than 7
        System.out.println(x == y); // returns false because 6 is not equal to 7
        System.out.println(x!=y); // returns true because 6 is not equal to 7
        System.out.println(x < y); // returns true because 6 is less than 7

        // Example of the real life
        int age = 18;
        System.out.println(age >= 18); // true, old enough to vote
        System.out.println(age<18); // false

        int passwordLenght = 5;
        System.out.println(passwordLenght >= 8); // false too short
        System.out.println(passwordLenght < 8); // true, needs more characters
    }
}
