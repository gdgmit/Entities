package com.example.entities.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Entities.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
