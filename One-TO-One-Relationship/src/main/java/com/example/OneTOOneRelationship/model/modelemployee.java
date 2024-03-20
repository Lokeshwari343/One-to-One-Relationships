package com.example.OneTOOneRelationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class modelemployee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        public int id;
        public String name;
        public String email;
        public String address;
        public String phone;
        public String department;
        public String designation;
        public String salary;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "project_id",referencedColumnName = "id")
        public modelproject project;

    }

