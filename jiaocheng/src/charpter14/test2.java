package charpter14;

import java.util.*;

public class test2 {
    public static void main(String[] args){
        Set<Character> sets = new HashSet<>();
        List<Character> characters = new ArrayList<>();
        sets.add('A');
        sets.add('a');
        sets.add('c');
        sets.add('C');
        sets.add('a');
        characters.add('A');
        characters.add('a');
        characters.add('c');
        characters.add('C');
        characters.add('a');
        Iterator<Character> it1 = sets.iterator();
        Iterator<Character> it2 = characters.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next());
        }
        System.out.println();
        while(it2.hasNext()){
            System.out.print(it2.next());
        }
    }
}
