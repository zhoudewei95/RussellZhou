package algorithm_2;

public class demo2_1 {
    public static void main(String[] args){
        int x,y,z;
        for(x=0;x<=20;x++){
            for(y=0;y<=33;y++){
                z = 100-x-y;
                if(5*x + 3*y + z/3 == 100 && z%3 == 0 ){
                    System.out.println("公鸡" + x +"只;" +"母鸡" + y + "只;" +"小鸡" + z +"只");
                }
            }
        }
    }
}
