package com.example.entities.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "Snacks")
public class Snacks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long snId;

    @Column(nullable = false, length = 100)
    private String snName;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal snPurchasePrice;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal snSellingPrice;

    @Lob
    private String snImageUrl;

    @Column(nullable = false,columnDefinition = "DEFAULT 0")
    private Integer snCurrentQuantity = 0;

    // Getters and Setters
}