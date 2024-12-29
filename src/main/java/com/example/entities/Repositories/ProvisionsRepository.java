package com.example.entities.Repositories;

import com.example.entities.Entities.Provisions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvisionsRepository extends JpaRepository<Provisions,Long> {
}
