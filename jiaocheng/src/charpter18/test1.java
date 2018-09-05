package charpter18;

public class test1 extends Thread {
    private Thread t;

    public test1(){
        t= new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("周德炜大帅逼");
                }


            }
        });
        t.start();
    }
    public static void main(String[] args){
        new test1();
    }

}
