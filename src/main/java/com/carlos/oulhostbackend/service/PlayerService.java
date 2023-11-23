package com.carlos.oulhostbackend.service;

import com.carlos.oulhostbackend.infra.CodenameHandler;
import com.carlos.oulhostbackend.model.DTOs.PlayerDTO;
import com.carlos.oulhostbackend.model.GroupType;
import com.carlos.oulhostbackend.model.Player;
import com.carlos.oulhostbackend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodenameHandler handler;
    public Player createPlayer(PlayerDTO dto) {

        Player newPlayer = new Player(dto);
        String codename = getCodename(dto.groupType());
        newPlayer.setCodename(codename);
        return repository.save(newPlayer);
    }

    private String getCodename(GroupType groupType){
        return handler.findCodename(groupType);
    }

    public List<Player> getAllPlayres() {
        return repository.findAll();
    }
}
