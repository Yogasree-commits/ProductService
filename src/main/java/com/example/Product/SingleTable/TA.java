package com.example.Product.SingleTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class TA extends User {
    private String noOfQuestions;
    private String college;
}
