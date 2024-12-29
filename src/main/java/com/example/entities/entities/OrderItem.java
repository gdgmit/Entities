package com.example.entities.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "Order_Items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "prId", nullable = false)
    private Products product;

    @Column(nullable = false)
    private Integer itemQuantity;

    @Column(nullable = false,precision = 10, scale = 2)
    private BigDecimal itemCurrentPrice;

    // Getters and Setters
}