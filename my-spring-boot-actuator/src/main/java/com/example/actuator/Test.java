package com.example.actuator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("A");
        stringList.add("e");

        String collect = stringList.stream().distinct().collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
