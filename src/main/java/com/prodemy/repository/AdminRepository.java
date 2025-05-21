package com.prodemy.repository;

import com.prodemy.model.Admin;
import com.prodemy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUser(User user);
    List<Admin> findByLevel(AdminLevel level);
}