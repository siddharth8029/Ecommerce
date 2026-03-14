package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private String brand;

    private BigDecimal price;
    private Date releaseDate;
    private String category;
    private boolean productAvailability;

    private int stockQuantity;
    private String imageName;
    private String imageType;
    @Column(columnDefinition = "bytea")
    @JsonIgnore  // ← ADD THIS
    private byte[] imageData;




}