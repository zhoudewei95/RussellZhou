package charpter6;

import sun.security.util.Length;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {

        int[] intArray = new int[]{53, 63, 12, 64, 777, 23, 536, 25, 36};

        Arrays.sort(intArray);
        System.out.println(intArray[0]);
        System.out.println(intArray[intArray.length-1]);
    }
}
