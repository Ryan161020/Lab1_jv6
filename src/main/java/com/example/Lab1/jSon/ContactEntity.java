package com.example.Lab1.jSon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactEntity {
    String email;
    String phone;
    String address;
}
