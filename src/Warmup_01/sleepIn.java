package Warmup_01;

public class sleepIn {
    public static void main(String[] args) {
        //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        //sleepIn(false, false) → true
        //sleepIn(true, false) → false
        //sleepIn(false, true) → true

        System.out.println(sleepIn(false,false)); // true   // true
        System.out.println(sleepIn(true,false));  // false   // false
        System.out.println(sleepIn(false,true));  // true    // true
        System.out.println(sleepIn(true,true));  // false    // true

    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) return false;
        else if (!weekday && !vacation) return true;
        else return true;
    }

}
