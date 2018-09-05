package charpter12;

public class test2 {
    class Number{
        public long getResult(int m , int n){
            int result = 0;
            result = m * n;
            return result;
        }
    }

    public static void main(String[] args) throws Exception{
        try{
            test2 test2 = new test2();
            test2.Number number = test2.new Number();
            System.out.println( number.getResult(2542,-21));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
