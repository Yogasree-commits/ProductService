package com.example.Product.SingleTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name="single_table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;
}
