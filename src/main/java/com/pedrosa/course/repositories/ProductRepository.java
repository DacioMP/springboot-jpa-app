package com.pedrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
