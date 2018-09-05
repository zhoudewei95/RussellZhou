package charpter17;

public class test1 {
    enum Constants2{
        CONSTANTS_A("I'm A"),
        CONSTANTS_B("I'm B");
        private String description;
        private Constants2(){

        }

        private Constants2(String description){
            this.description = description;
        }

        public String getDescription(){
            return description;
        }
    }

    public static void doEnum(Constants2 c){
        switch (c){
            case CONSTANTS_A:
                System.out.println("CONSTANT_A的值是:" + Constants2.CONSTANTS_A.getDescription());
                break;
            case CONSTANTS_B:
                System.out.println("CONSTANT_B的值是:" + Constants2.CONSTANTS_B.getDescription());
                break;
        }
    }

    public static void main(String[] args){
        test1.doEnum(Constants2.CONSTANTS_A);
        test1.doEnum(Constants2.CONSTANTS_B);
    }

}
