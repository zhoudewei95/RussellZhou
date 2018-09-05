package charpter10;

public class test3 {
    String str = "father";
    test3(){ }
    void say(){
        System.out.println("hello_father");
    }

    static class son extends test3{
        String str1 = "son";
        son(){ }
        void say(){
            System.out.println("hello_son");
        }
    }

    public static void main(String[] args){
        test3 son = new son();
        son.say();
        System.out.println(son.str);
        System.out.println(((son) son).str1);
    }
}
