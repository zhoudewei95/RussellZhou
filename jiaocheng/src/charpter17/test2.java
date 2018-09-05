package charpter17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test2<T extends List> {
    public static void main(String[] args){
        test2<ArrayList> list = new test2<ArrayList>();
        test2<LinkedList> list1 = new test2<LinkedList>();

    }

}
