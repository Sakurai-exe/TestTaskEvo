package com.example.testtaskforevotor.repository;

import com.example.testtaskforevotor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface UserFindRepo extends JpaRepository<User, String> {
   List<User> findByNameLike(String name);
//    List<User> findBySurNameLike(String surname);
}
