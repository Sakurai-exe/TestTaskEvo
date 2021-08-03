package com.example.testtaskforevotor.repository;

import com.example.testtaskforevotor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
