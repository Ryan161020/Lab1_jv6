package com.example.Lab1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lambda {
    static List<Student> list = Arrays.asList(
            new Student("c", true, 1.0),
            new Student("c", false, 5.6),
            new Student("c", true, 4.7)
    );
    public static void main(String[] args) {
        demo4();
        
    }

    private static void demo4() {
        Demo4Inter o = (int x)->{
                System.out.println(x);

            };

        o.m1(222);
    }

    private static void demo3() {
        Collections.sort(list,(sv1, sv2) -> sv1.getMarks().compareTo(sv2.getMarks()));
        list.forEach(sv ->{
            System.out.println(sv.getName());
            System.out.println(sv.getMarks());
            System.out.println();
        });
    }


    private static void demo2() {


        list.forEach(sv -> {
            System.out.println(sv.getName());  // In tên sinh viên
            System.out.println(sv.getMarks()); // In điểm sinh viên
            System.out.println();  // In một dòng trống
        });
    }

    private static void demo1() {
        List<Integer> list = Arrays.asList(1, 3, 5, 8, 9, 2, 7);
        list.forEach(n -> System.out.println(n));
    }
}

@FunctionalInterface
interface Demo4Inter{
    void m1(int x);
    default void m2() {}
    public static void m3() {}
}