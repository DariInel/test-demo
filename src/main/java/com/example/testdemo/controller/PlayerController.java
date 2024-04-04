package com.example.testdemo.controller;

import com.example.testdemo.entity.PlayerEntity;
import com.example.testdemo.service.PlayerService;
import com.example.testdemo.service.impl.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlayerController {
    @Autowired
    PlayerService playerService;
    @GetMapping(value = "/players")
    @ResponseBody
    public List<PlayerEntity> geyAllPlayers()
    {
        return playerService.getAllPlayers();
    }

    @PostMapping(value = "/player/add/{name}")
    @ResponseBody
    public HttpStatusCode addPlayer(@PathVariable String name){
        playerService.addNewPlayer(name, "Ivanov", "Iv");
        return HttpStatus.OK;
    }
}
