package com.pedrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}