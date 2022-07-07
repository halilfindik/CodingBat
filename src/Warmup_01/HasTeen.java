package Warmup_01;

public class HasTeen {
    public static void main(String[] args) {

        System.out.println(hasTeen(13,20,10));

    }
    public static boolean hasTeen(int a, int b, int c) {
        int[] nums= {a,b,c};
        int count=0;
        for (int num : nums) {
            if (num > 12 && num < 20) count++;
        }
        return count>0;
    }
}
