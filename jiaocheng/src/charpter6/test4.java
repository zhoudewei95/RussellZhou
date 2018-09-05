package charpter6;

public class test4 {
    public static void main(String[] args){
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr1[i].length;j++){
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }


    }
}
