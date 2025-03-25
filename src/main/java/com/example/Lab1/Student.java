package com.example.Lab1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  // Lombok tạo constructor có tất cả các tham số
@NoArgsConstructor   // Lombok tạo constructor không tham số (mặc định)
public class Student {
    private String name;
    private Boolean gender = false;
    private Double marks = 0.0;
}
