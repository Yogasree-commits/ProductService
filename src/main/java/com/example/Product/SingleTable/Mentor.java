package com.example.Product.SingleTable;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Mentor extends User {
    private String avgRating;
    private String currentCompany;
}
