package charpter7;

public class test2 {
    private long length;
    private long width;

    public test2(long length, long width) {
        this.length = length;
        this.width = width;
    }
    public test2(){

    }

    public static long getArea(long length,long width){
        long area = length * width;
        return area;
    }

    public static void main(String[] args){
        long area = test2.getArea(1000,3000);
        System.out.println(area);
    }
}
