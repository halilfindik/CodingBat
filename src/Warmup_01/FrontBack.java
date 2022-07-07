package Warmup_01;

public class FrontBack {
    public static void main(String[] args) {
        //Given a string, return a new string where the first and last chars have been exchanged.
        //frontBack("code") → "eodc"
        //frontBack("a") → "a"
        //frontBack("ab") → "ba"



    }
    public static String frontBack(String str) {
        if (str.length()>1) {
            for (int i = 0; i < str.length(); i++) {
                return str.charAt(str.length()-1)+str.substring(1, (str.length()-1)) + str.charAt(0);
            }
        } return str;
    }
}
