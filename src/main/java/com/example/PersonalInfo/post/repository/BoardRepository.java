package com.example.PersonalInfo.post.repository;

import com.example.PersonalInfo.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
