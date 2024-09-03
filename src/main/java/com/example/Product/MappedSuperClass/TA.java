package com.example.Product.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msc_ta")
public class TA extends User {
    private String noOfQuestions;
    private String college;
}
