package com.prodemy.service;

import com.prodemy.model.Admin;
import org.hibernate.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.annotation.*;
import org.springframework.http.*;
import org.springframework.security.access.prepost.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.*;


@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin promoteToAdmin(User user, AdminLevel level) {
        Admin admin = new Admin();
        admin.setUser(user);
        admin.setLevel(level);
        admin.setCanManageUsers(level == AdminLevel.SUPER_ADMIN);
        return adminRepository.save(admin);
    }

    public boolean canManageUsers(Long adminId) {
        return adminRepository.findById(adminId)
                .map(Admin::isCanManageUsers)
                .orElse(false);
    }
}