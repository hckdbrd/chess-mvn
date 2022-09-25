package com.project.chess.data.repository;

import com.project.chess.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>  {
   User getByUsername(String username);
}
