package com.example.entities.Entities;

import jakarta.persistence.*;
import lombok.*;
import com.example.entities.Enums.TransactionType;
import com.example.entities.Enums.PaymentStatus;
import com.example.entities.Enums.OrderStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "Orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column()
    private LocalDateTime orderDate = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus orderStatus; //set to DELIVERED only if all items in this order are DELIVERED

    @Column(nullable = false,precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(unique = true, length = 100)
    private String paymentId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionType transactionType = TransactionType.ONLINE;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus paymentStatus;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrderItem> orderItems;

    @OneToOne(mappedBy = "order")
    private QR qrCode;

    // Getters and Setters
}
