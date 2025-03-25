package com.example.Lab1.jSon;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.Map;

public class jSon2 {
    public static void main(String[] args) throws Exception {
        demojs3();
    }

    private static void demojs3() throws Exception {

    }

    private static void demojs2() throws Exception {
        String path ="E:\\FPT\\JAVA6\\Lab1\\src\\main\\java\\com\\example\\Lab1\\jSon\\students.json";
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String,Object>>students = mapper.readValue(new File(path),List.class);
        students.forEach(student ->{
            System.out.println(student.get("name"));
        });
    }

    private static void demojs1() throws Exception {
        String path ="E:\\FPT\\JAVA6\\Lab1\\src\\main\\java\\com\\example\\Lab1\\jSon\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object>student = mapper.readValue(new File(path),Map.class);

        System.out.println(student.get("name"));
        System.out.println(student.get("marks"));
        System.out.println(student.get("gender"));
        Map<String, Object> contact = (Map<String, Object>) student.get("contact");
        System.out.println(contact.get("email"));
        System.out.println(contact.get("phone"));
        List<String> subjects = (List<String>) student.get("subjects");
        subjects.forEach( subject ->{
            System.out.println(subject);
        });
    }
}
