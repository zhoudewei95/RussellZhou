package charpter9;

public class test1 {
    public static int GetEvenNum(int num1,int num2){
        int s = (int) (num1 + (Math.random() * (num2 - num1)));
        if(s%2 == 0){
            return s;
        }else{
            return s+1;
        }
    }

    public static void main(String[] args){
        int sum = 0;
        for(int i=0;i<=5;i++){
            int[] arr = new int[6];
            int result = test1.GetEvenNum(2,32);
            arr[i] = result;
            System.out.println(arr[i]);
            sum = sum + arr[i];
            System.out.println("此时的和是:" + sum);
        }


    }
}
