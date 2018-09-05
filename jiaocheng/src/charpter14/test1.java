package charpter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("1-100的集合是:");
        for (int i = 1; i <= 100; i++) {
            int number = i;
            list.add(i);
            System.out.print(number + ",");
        }
        System.out.println("\n" + "将索引位置是10的对象剔除之后该集合变为：");
        list.remove(10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }

    }
}
