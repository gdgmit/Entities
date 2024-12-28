package com.example.entities.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "Provisions")
public class Provisions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long provId;

    @Column(nullable = false, length=100)
    private String provName;

    @Column(nullable = false,precision = 10, scale = 2)
    private BigDecimal provPrice;

    @Column(columnDefinition = "DEFAULT 0")
    private Integer provQuantity = 0;

    @Column(nullable = false)
    private LocalDate provPurchaseDate;

    // Getters and Setters
}