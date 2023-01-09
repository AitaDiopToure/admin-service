package com.groupeisi.adminservice.service;

import com.groupeisi.adminservice.entity.Admin;
import com.groupeisi.adminservice.repository.AdminRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class AdminService {
    private AdminRepo adminRepo;

    @PostConstruct
    public void initializeAdminTable(){
        adminRepo.saveAll(
                Stream.of(
                        new Admin("Aitatoure ", "M2"),
                        new Admin("weli9s ", "sarr"),
                        new Admin("Pendadhjm9 ", "Ndiaye"),
                        new Admin("khadim hxy", "toure")
                ).collect(Collectors.toList())
        );
    }
    public Optional<Admin> getAdmin(Long id) {
        return adminRepo.findById(id);
    }

    public List<Admin> getAll() {
        return adminRepo.findAll();
    }
}
