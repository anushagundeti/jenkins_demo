package net.javaguides.springboot.entities;
import jakarta.persistence.*;
@Entity
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;
}
