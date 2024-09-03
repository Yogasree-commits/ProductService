package com.example.Product.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_mentor")
public class Mentor extends User {
    private String avgRating;
    private String currentCompany;
}
