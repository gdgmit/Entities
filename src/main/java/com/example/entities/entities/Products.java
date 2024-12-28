package com.example.entities.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "Products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prId;

    @Column(nullable = false,length = 100)
    private String prName;

    @Column(nullable = false,precision = 10,scale = 2)
    private BigDecimal prSellingPrice;

    @Lob
    private String prImageUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductCategory prCategory;

    @Column(columnDefinition = "DEFAULT 0")
    private Integer prCurrentQuantity = 0;

    @ManyToMany(mappedBy = "products")
    private Set<Categories> categories;

}