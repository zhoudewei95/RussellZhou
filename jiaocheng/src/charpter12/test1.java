package charpter12;

public class test1 {
    public class MyException extends Exception{
        public MyException(String ErrorMessage){
            super(ErrorMessage);
        }
    }

    class Student{
        public void speak(int m) throws MyException{
            if(m >1000){
                throw new MyException("m的值大于1000了！");
            }
        }
    }

    public static void main(String[] args){
        try{
            test1 test1 = new test1();
            test1.Student student = test1.new Student();
            student.speak(1200);

        }catch(MyException e){
            e.printStackTrace();
        }
    }

}
