package com.example.testdemo.service;

import com.example.testdemo.entity.PlayerEntity;

import java.util.List;

public interface PlayerService {
    void addNewPlayer(String name, String lastname, String nickname);
    List<PlayerEntity> getAllPlayers();
}
