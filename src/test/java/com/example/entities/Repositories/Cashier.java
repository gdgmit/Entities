package com.example.entities.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "Cashiers")
public class Cashier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cashierId;

    @Column(nullable = false, unique = true, length = 100)
    private String cashierName;

// relavant fields to be added later, if needed
}
