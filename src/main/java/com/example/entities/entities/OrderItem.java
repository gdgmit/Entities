package com.example.entities.Entities;

import jakarta.persistence.*;
import lombok.*;
import com.example.entities.Enums.OrderStatus;
import com.example.entities.Enums.ItemType;
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
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Orders order;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus deliveryStatus;//delivery status of the particular item

    @Column(nullable=false)
    private Long itemId; //references either prId or snacksId (without fk constraint)

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ItemType itemType; //indicates whether the item is a snack or product

    @Column(nullable = false)
    private Integer itemQuantity;

    @Column(nullable = false,precision = 10, scale = 2)
    private BigDecimal itemCurrentPrice;

    // Getters and Setters
}