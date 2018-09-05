package charpter19;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.annotation.Target;
import java.net.Socket;

public class test2_1 extends JFrame {
    private PrintWriter printWriter;
    Socket socket;
    private JTextArea jTextArea = new JTextArea();
    private JTextField jTextField = new JTextField();
    Container cc;
    public test2_1(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc = this.getContentPane();
        final JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(jScrollPane,BorderLayout.CENTER);
        jScrollPane.setViewportView(jTextArea);
        cc.add(jTextField,"South");
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printWriter.println(jTextField.getText());
                jTextArea.append(jTextField.getText() + '\n');
                jTextArea.setSelectionEnd(jTextArea.getText().length());
                jTextField.setText("");

            }
        });
    }

    private void connect(){
        jTextArea.append("尝试连接\n");
        try{
            socket = new Socket("127.0.0.1",8001);
            printWriter = new PrintWriter(socket.getOutputStream(),true);
            jTextArea.append("完成连接\n");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        test2_1 myclient = new test2_1("向服务器发送数据");
        myclient.setSize(500,500);
        myclient.setVisible(true);
        myclient.connect();
    }

}
