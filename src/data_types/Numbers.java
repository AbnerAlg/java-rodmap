package data_types;

public class Numbers {
    public static void main (String[]args){
        /* Integer types */

        // BYTE (-128 AND 127)
        byte myNum = 100;
        System.out.println(myNum);

        // SHORT (-32768 to 32767)
        short myNum2 = 5000;
        System.out.println(myNum2);

        // LONG (-92222314.. and 922222314...)
        long myNum3 = 1263849L;
        System.out.println(myNum3);

        /* Floating point types */

        // float 'f' (6-7 decimal digits)
        float myNumb = 9.99f;
        System.out.println(myNumb);

        // Double 'd' (16 digits)
        double myNumd = 1010.20d;
        System.out.println(myNumd);

        /* Scientific Numbers */
        // 'e' to indicate the power of 10
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }
}
