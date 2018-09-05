package charpter12;

public class test3 {
    class Computer{
        public long getGYS(int m,int n) throws MyException{
            long result = 0;
            if(m < n){
                m = m + n;
                n = m - n;
                m = m - n;
            }
            if(m % n == 0){
                result = n;
            }
            while(m % n > 0){
                m = m % n;
                if(m < n){
                    m = m + n;
                    n = m - n;
                    m = m - n;
                }
                if(m % n == 0){
                    result = n;
                }
            }
            if(m < 0 ){
                throw new MyException("参数不能为负数");
            }
            if(n < 0 ){
                throw new MyException("参数不能为负数");
            }
            return result;
        }
    }

    public class MyException extends Exception{
        public MyException(String ErrorMessage){
            super(ErrorMessage);
        }
    }

    public static void main(String[] args){
        try{
            test3 test3 = new test3();
            test3.Computer computer= test3.new Computer();
            long reslut = computer.getGYS(2000,5000);
            System.out.println("最大公约数是:" + reslut);
        }catch(MyException e){
            e.printStackTrace();
        }

    }
}
