package com.carlos.oulhostbackend.controller;

import com.carlos.oulhostbackend.model.DTOs.PlayerDTO;
import com.carlos.oulhostbackend.model.Player;
import com.carlos.oulhostbackend.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDTO dto){
        Player newPlayer = playerService.createPlayer(dto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(playerService.getAllPlayres(), HttpStatus.OK);
    }
}
