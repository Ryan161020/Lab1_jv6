package com.example.Lab1.jSon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;


public class jSon1 {

    public static void main(String[] args) throws Exception {
        dmjs2();
    }

    private static void dmjs2()throws Exception {
        String path ="E:\\FPT\\JAVA6\\Lab1\\src\\main\\java\\com\\example\\Lab1\\jSon\\students.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode students = mapper.readTree(new File(path));
        students.iterator().forEachRemaining(student -> {
            System.out.println(student.get("name").asText());
        });
    }

    private static void dmjs1 () throws Exception {
        String path ="E:\\FPT\\JAVA6\\Lab1\\src\\main\\java\\com\\example\\Lab1\\jSon\\student.json";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode student = mapper.readTree(new File(path));

        System.out.println(student.get("name").asText());
        System.out.println(student.get("gender").asBoolean());
        System.out.println(student.get("mark").asDouble());
        System.out.println(student.get("contact").get("email").asText());
        System.out.println(student.findValue("phone").asText());
        student.get("subjects").iterator().forEachRemaining(s -> {
            System.out.println(s.asText());
        });








    }
    }

