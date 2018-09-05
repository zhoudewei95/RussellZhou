package charpter6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr2;

        System.out.println("arr1是:");
        for(int i=0;i<arr1.length;i++){

            if(i == arr1.length-1){
                System.out.print(arr1[i]);
            }else {
                System.out.print(arr1[i] + ",");
            }
        }

        arr2 = Arrays.copyOfRange(arr1,0,4);
        System.out.println("\n");
        System.out.println("arr2是:");
        for(int i=0;i<arr2.length;i++){
            if(i == arr2.length-1){
                System.out.print(arr2[i]);
            }else {
                System.out.print(arr2[i] + ",");
            }
        }

    }
}
