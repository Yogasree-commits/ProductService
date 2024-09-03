package com.example.Product.SingleTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Learner extends User {
    private String college;
    private String company;
}
