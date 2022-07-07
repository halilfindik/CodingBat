package Warmup_01;

public class StartHi {
    public static void main(String[] args) {
        //Given a string, return true if the string starts with "hi" and false otherwise.
        //startHi("hi there") → true
        //startHi("hi") → true
        //startHi("hello hi") → false

        String s="hid there";
        System.out.println(startHi(s));

    }
    public static boolean startHi(String str) {
        return (str.startsWith("hi"));
    }
}
