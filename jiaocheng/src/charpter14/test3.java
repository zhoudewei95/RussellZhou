package charpter14;

import java.util.*;

public class test3 {
    class Emp{
        private String id;
        private String name;

        public String getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        test3 test3 = new test3();
        test3.Emp emp1 = test3.new Emp();
        test3.Emp emp2 = test3.new Emp();
        test3.Emp emp3 = test3.new Emp();
        emp1.setId("001");
        emp1.setName("kobe");
        emp2.setId("002");
        emp2.setName("james");
        emp3.setId("015");
        emp3.setName("harden");

        map.put(emp1.id,emp1.name);
        map.put(emp2.id,emp2.name);
        map.put(emp3.id,emp3.name);

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        System.out.println("key集合是:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collection<String> collection = map.values();
        Iterator<String> iterator1 = collection.iterator();
        System.out.println("value集合是:");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        map.remove("015");
        Set<String> set1 = map.keySet();
        Iterator<String> iterator2 = set1.iterator();
        System.out.println("现在key集合是:");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("现在value集合是:");
        Collection<String> collection1 = map.values();
        Iterator<String> iterator3 = collection1.iterator();
        while(iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
    }
}
