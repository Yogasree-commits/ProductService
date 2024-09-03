package com.example.Product.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msc_mentor")
public class Mentor extends User {
    private String avgRating;
    private String currentCompany;
}
