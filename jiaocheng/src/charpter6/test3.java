package charpter6;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args){
        String[] arr = new String[]{"aa","ac","sd","sg","tf"};
        for(int i=0;i<arr.length;i++){

            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("\n");
        Arrays.fill(arr,2,3,"bb");
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }


    }
}
