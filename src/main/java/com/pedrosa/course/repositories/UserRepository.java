package com.pedrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrosa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
