package com.example.entities.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Entities.Categories;

@Repository
public interface CategoryRepository extends JpaRepository<Categories,Long> {
}
