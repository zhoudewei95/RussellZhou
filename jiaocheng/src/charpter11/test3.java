package charpter11;

public class test3 {
    public static class inner{
        String say(){
            return "HelloWorld";
        }
    }

    public static void main(String[] args){
        inner inner = new inner();
        String str = inner.say();
        System.out.println(str);
    }
}
