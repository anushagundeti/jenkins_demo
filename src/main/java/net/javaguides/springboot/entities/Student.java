package net.javaguides.springboot.entities;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne
    private Laptop laptop;
}
