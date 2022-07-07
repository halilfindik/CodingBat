package Warmup_01;

public class nearHundred {
    public static void main(String[] args) {
        //Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
        //nearHundred(93) → true
        //nearHundred(90) → true
        //nearHundred(89) → false

        System.out.println(isNearHundred(191));

    }
    public static boolean isNearHundred(int num) {
        return ((Math.abs((100-num))<=10) || (Math.abs((200-num))<=10));
    }
}
