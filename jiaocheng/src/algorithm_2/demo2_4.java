package algorithm_2;

public class demo2_4 {
    public static void main(String[] args){
        float[] num = new float[48];
        num[47] = (float) (1000/(1+0.0171/12));
        for(int i=46;i>=0;i--){
            num[i] = (float)((num[i+1] + 1000)/(1+0.0171/12));
            System.out.println("第" + i + "个月月末存款为：" + num[i]);
        }


    }
}
