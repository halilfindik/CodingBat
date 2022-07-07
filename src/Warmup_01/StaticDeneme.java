package Warmup_01;

import java.util.ArrayList;
import java.util.List;

public class StaticDeneme {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        int dizi[] = new int[5];
        dizi[0]=1;

        System.out.println("dizi[1] = " + dizi[1]);
        
        elements.add(10);
        int firstElmnt = elements.get(0);
        System.out.println(firstElmnt);
    }

}
