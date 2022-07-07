package Warmup_01;

public class parrotTrouble {
    public static void main(String[] args) {
        //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        //We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
        //parrotTrouble(true, 6) → true
        //parrotTrouble(true, 7) → false
        //parrotTrouble(false, 6) → false

        System.out.println(isTrouble(true, 6));
        System.out.println(isTrouble(true, 7));
        System.out.println(isTrouble(true, 19));
        System.out.println(isTrouble(true, 20));
        System.out.println(isTrouble(false, 22));

    }
    public static boolean isTrouble(boolean talking, int hour) {
        if (!talking) return false;
        else return hour < 7 || hour >= 20;
    }
}
