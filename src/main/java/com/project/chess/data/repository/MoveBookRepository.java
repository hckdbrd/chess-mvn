package com.project.chess.data.repository;

import com.project.chess.data.entity.MoveBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveBookRepository extends JpaRepository<MoveBook, Long> {
}
