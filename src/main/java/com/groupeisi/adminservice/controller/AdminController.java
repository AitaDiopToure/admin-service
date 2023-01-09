package com.groupeisi.adminservice.controller;

import com.groupeisi.adminservice.entity.Admin;
import com.groupeisi.adminservice.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@AllArgsConstructor

public class AdminController {
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAll() {
        return adminService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Admin> getAdmin(@PathVariable("id") Long id) {
        return adminService.getAdmin(id);
    }
}
