package com.bouta.ecommapp.dao;

import com.bouta.ecommapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
