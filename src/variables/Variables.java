package variables;

public class Variables {
    public static void main(String[]args){
        // Declaring (Creating) variables
        String name = "Jhon";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        // Assigning the value
        int myNum2;
        myNum2 = 5;

        System.out.println(myNum2);

        // Change the value of myNum from 15 to 20
        myNum = 20;
        System.out.println(myNum);

        // If you don't want others to overwrite existing values use the final keyword
        final int myNum3 = 16;
        // myNum3 = 20;

    }
}
