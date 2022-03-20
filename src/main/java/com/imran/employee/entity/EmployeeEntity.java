package com.imran.employee.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="empolyees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private  String lastName;
    private String emailId;
}
