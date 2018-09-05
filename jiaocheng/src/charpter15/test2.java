package charpter15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test2 {
   /* public static void main(String[] args) {
        try {
            File file = new File("D:\\word.txt");
            FileWriter out = new FileWriter(file);
            String s = "湖人总冠军";
            out.write(s);
            out.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        //FileReader读取文本数据
        try{
            File file = new File("D:\\word.txt");
            FileReader in = new FileReader(file);
            char by[] = new char[1024];
            int len = in.read(by);
            System.out.println(new String(by,0,len));

        }catch (IOException e){
            e.printStackTrace();
        }

    }*/
   public static void main(String[] args) {
       char a[] = "今天10点出发".toCharArray();
       int n = 0;
       try {
           File out = new File("word.txt");
           for (int i = 0; i < a.length; i++) {
               a[i] = (char) (a[i] ^ 'R');  //加密方式
           }
           FileWriter fw = new FileWriter(out);
           fw.write(a, 0, a.length);
           fw.close();
           FileReader fr = new FileReader(out);
           char tom[] = new char[10];
           System.out.println("加密后：");
           while ((n = fr.read(tom, 0, 10)) != -1) {
               String s = new String(tom, 0, n);
               System.out.println(s);
           }
           fr.close();
           fr = new FileReader(out);
           System.out.println("明文：");
           while ((n = fr.read(tom, 0, 10)) != -1) {
               for (int j = 0; j < n; j++) {
                   tom[j] = (char) (tom[j] ^ 'R');
               }
               String str = new String(tom, 0, n);
               System.out.println(str);
           }

           fr.close();
       } catch (Exception e) {
           e.printStackTrace();
       }

   }

}
