package com.example.entities.Repositories;

import com.example.entities.Entities.Snacks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnacksRepository extends JpaRepository<Snacks,Long> {
}
