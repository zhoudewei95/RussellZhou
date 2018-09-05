package charpter15;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class test3 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\word.txt");
            FileWriter fileWriter = new FileWriter(file);
            Map<String,String> map = new HashMap<>();
            map.put("5120146762","周德炜");
            map.put("5120145108","吕洪卿");
            Set<String> sets = map.keySet();
            Iterator<String> iterator = sets.iterator();
            Collection<String> collection = map.values();
            Iterator<String> iterator1 = collection.iterator();
            while(iterator.hasNext()){
               fileWriter.write(iterator.next());
                while(iterator1.hasNext()){
                    fileWriter.write(iterator1.next());
                }
            }
            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
