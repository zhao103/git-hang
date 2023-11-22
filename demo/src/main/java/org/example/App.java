package org.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        List<String> getlist = getlist();
        for(String s : getlist){
            System.out.println(s);
        }

        System.out.println("数组的长度是"+getlist.size());
    }

    public static List<String> getlist(){
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("数据");
        int i = 1;
        int b = 3 ;
        Integer c = b+i;
        list.add(c.toString());
        return list;
    }
}
