package algorithm_2;

public class demo2_3 {
    public static void main(String[] args){
        int[] num = new int[30];
        num[0] = 1;
        num[1] = 1;
        System.out.println("第1个月兔子的总数是:1");
        System.out.println("第2个月兔子的总数是:1");
        for(int i=2;i<=23;i++){
            num[i] = num[i-2] + num[i-1];
            int j = i+1;
            System.out.println("第" + j +"个月兔子的总数是:" + num[i]);

        }



    }
}
