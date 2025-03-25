package com.example.Lab1.jSon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    String name;
    Boolean gender;
    Double marks = 0.0;
    ContactEntity contact;
    List<String> subjects;
}
