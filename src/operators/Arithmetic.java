package operators;

public class Arithmetic {
    static void main(String[] args) {
        // Are used to perform common mathematical operations
        int x = 10;
        int y = 5;

        System.out.println(x + y);
        System.out.println(x - y );
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        int z = 6;
        ++z; // 7
        // --z; -> 5
        System.out.println(z);

        int a = 10;
        int b = 3;

        System.out.println(a / b); // The result always integers 3

        double c = 10.0d;
        double d = 3.0d;

        System.out.println(c / d); // The result is 3.3333...

        int f = 5;

        ++f; // Increment x by 1 (x becomes 6)
        --f; // Decrement x by 1 (x becomes 5 again)

        System.out.println(f); // 5

        // Real Life example: Counting peoples
        int peopleInRoom = 0;

        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;

        System.out.println(peopleInRoom);  // 3

        // But 1 person leaves
        peopleInRoom--;
        System.out.println(peopleInRoom); //2
    }
}
