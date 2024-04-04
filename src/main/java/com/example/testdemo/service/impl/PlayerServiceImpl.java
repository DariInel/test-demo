package com.example.testdemo.service.impl;

import com.example.testdemo.entity.PlayerEntity;
import com.example.testdemo.repository.PlayerRepository;
import com.example.testdemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public void addNewPlayer(String name, String lastname, String nickname){
        PlayerEntity newPlayer = new PlayerEntity();
        newPlayer.setName(name);
        newPlayer.setLastname(lastname);
        newPlayer.setNickname(nickname);
        playerRepository.save(newPlayer);
    }
    public List<PlayerEntity> getAllPlayers(){
        return playerRepository.findAll();
    }

}
