package com.example.entities.Repositories;

import com.example.entities.Entities.QR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QRRepository extends JpaRepository<QR,Long> {
}
