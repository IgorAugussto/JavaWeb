package com.devsuperior.JavaWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.JavaWeb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
