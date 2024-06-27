package com.pedrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
