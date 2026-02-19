package com.shop.cosmetics.repository;

import com.shop.cosmetics.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}


