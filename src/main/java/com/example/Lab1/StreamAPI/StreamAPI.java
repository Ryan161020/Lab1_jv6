package com.example.Lab1.StreamAPI;

import com.example.Lab1.lambda.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static com.example.Lab1.lambda.Lambda.list;

public class StreamAPI {
    public static void main(String[] args) {
        demo4();
    }

    static void demo4() {
        double average = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .average().getAsDouble();
            System.out.println(average);

        double sum = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .sum();
            System.out.println(sum);

        double min_marks = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .min().getAsDouble();
            System.out.println(min_marks);

        boolean all_passed = list.stream().allMatch(sv -> sv.getMarks() > 5);
            System.out.println(all_passed);

        Student  min_sv = list.stream()
                .reduce(list.get(0), (min,sv) -> sv.getMarks()< min.getMarks() ? sv : min);
        System.out.println(min_sv.getName());


    }

        static void demo3() {
            List<Student> result = list.stream()
                    .filter(sv -> sv.getMarks() >= 7)
                    .peek(sv -> sv.setName(sv.getName().toUpperCase()))
                    .collect(Collectors.toList());
            result.forEach(sv -> {
                System.out.println(sv.getName());
                System.out.println(sv.getMarks());
                System.out.println();
            });
        }





    static void demo2() {
        List<Integer> list = Arrays.asList(4, 2);
        List<Double> result = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> Math.sqrt(n))
                .peek(d -> System.out.println(d))
                .collect(Collectors.toList());

    }

    private static void demo1() {
        Stream<Integer> stream1 = Stream.of(1, 9, 5, 4, 6);
        stream1.forEach(n -> {
            System.out.println(n);
        });

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().forEach(n -> {
            System.out.println(n);
        });


    }
    }


