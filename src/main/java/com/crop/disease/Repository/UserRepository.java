package com.crop.disease.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crop.disease.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
