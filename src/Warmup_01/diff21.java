package Warmup_01;

public class diff21 {
    public static void main(String[] args) {
        //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
        //diff21(19) → 2
        //diff21(10) → 11
        //diff21(21) → 0

        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(23));
        System.out.println(diff21(27));
    }
    public static int diff21(int n) {
        if (n<=21) return Math.abs(n-21);
        else return Math.abs(21-n)*2;
    }
}
