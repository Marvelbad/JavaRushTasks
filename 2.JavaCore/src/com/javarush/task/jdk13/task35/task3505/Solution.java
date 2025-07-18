package com.javarush.task.jdk13.task35.task3505;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* 
Wildcards
*/

public class Solution {

    public static <T> void add(List<? super T> destinationList, List<? extends T> sourceList) {
        ListIterator<? super T> destListIterator = destinationList.listIterator();
        ListIterator<? extends T> srcListIterator = sourceList.listIterator();
        for (T t : sourceList) {
            destinationList.add(t);
        }
    }

    public static void main(String[] args) {
        List<B> destination = new ArrayList<>();
        destination.add(new B());
        List<C> source = new ArrayList<>();
        source.add(new C());
        add(destination, source);
        System.out.println(destination);
        System.out.println(source);



    }

    static class A {
    }

    static class B extends A {
    }

    static class C extends B {
    }
}
