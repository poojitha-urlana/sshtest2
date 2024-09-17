package com.crop.disease.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crop.disease.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
