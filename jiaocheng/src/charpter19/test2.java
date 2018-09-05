package charpter19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class test2 {
    private BufferedReader bufferedReader;
    private ServerSocket serverSocket;
    private Socket socket;
    void getServer(){
        try{
            serverSocket = new ServerSocket(8001);
            System.out.println("服务器套接字已经连接成功");
            while(true){
                System.out.println("等待客户机的连接");
                socket = serverSocket.accept();
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    private void getClientMessage() {
        try{
            while(true){
                System.out.println(" 客户机:" + bufferedReader.readLine());
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(socket != null){
                socket.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        test2 tcp = new test2();
        tcp.getServer();
    }

}
