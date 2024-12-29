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
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "roleId", nullable = false)
    private Role role;

    @Column(nullable = false, unique = true, length = 100)
    private String emailAddress;

    @Column(length = 15)
    private String phoneNumber;

    private String remarks;
    private String password;

    private LocalDateTime lastLogin;
    private Integer activeSessions;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Status status;

    @Column(nullable = false)
    private String createdBy;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private String modifiedBy;
    private LocalDateTime modifiedAt;

    @Column(nullable = false, length = 50)
    private String firstName;

    private String middleName;
    private String lastName;
    private String profilePic;

    public enum Status {
        ACTIVE, INACTIVE
    }
}
