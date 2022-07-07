package Warmup_01;

public class makes10 {
    public static void main(String[] args) {
        //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        //makes10(9, 10) → true
        //makes10(9, 9) → false
        //makes10(1, 9) → true

        System.out.println(doesMake10(9,10));
        System.out.println(doesMake10(10,9));
        System.out.println(doesMake10(21,-11));
        System.out.println(doesMake10(9,9));
    }
    public static boolean doesMake10(int a, int b) {
        return a + b == 10 || a == 10 || b == 10;
    }
}
