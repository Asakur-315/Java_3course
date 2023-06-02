package com.pract1.tests.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="student_answer")
@Data
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowId;
    private int testId;
    private int userId;
    private int answerId;
}
