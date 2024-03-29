package com.pract1.tests.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="test_list")
@Data
public class TestList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowId;
    private String name;
    private Integer subjectId;
    private Integer teacherId;

}
