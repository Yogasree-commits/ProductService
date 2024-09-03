package com.example.Product.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_ta")
public class TA extends User {
    private String noOfQuestions;
    private String college;
}
