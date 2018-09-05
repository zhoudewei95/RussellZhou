package charpter11;

public class test1 {
    interface Inter {
        void show();
    }

    static class Outer{
      public static Inter method(){
            return new Inter(){
                public void show(){
                    System.out.println("Hello World");
                };
            };

      }

    }

    static class OuterDemo{
        public static void main(String[] args){
            Outer.method().show();
        }
    }

}
