package com.example.entities.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "QR")
public class QR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qrId;

    @OneToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Orders order;

    @Lob
    @Column(nullable = false)
    private String qrCode;

//    @ManyToOne
//    @JoinColumn(name = "scannedBy")
//    private User scannedBy;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime scanDate = LocalDateTime.now();

    // Getters and Setters
}

