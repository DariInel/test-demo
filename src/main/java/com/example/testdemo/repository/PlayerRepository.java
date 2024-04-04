package com.example.testdemo.repository;

import com.example.testdemo.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
    PlayerEntity findPlayerById(Long id);
}
