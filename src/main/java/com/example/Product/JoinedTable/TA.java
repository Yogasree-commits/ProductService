package com.example.Product.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name="jt_ta")
@PrimaryKeyJoinColumn(name="user_id")
public class TA extends User {
    private String noOfQuestions;
    private String college;
}
