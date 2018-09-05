package charpter10;

public class test2 {

    public void say(){
        System.out.println("hello");
    }

    void speak(){
        System.out.println("bye");
    }

    static class son extends test2{
        void speak(){
            System.out.println("gugudie");
        }

    }

    public static void main(String[] args){
        test2 test2 = new son();
        test2.say();
    }
}
