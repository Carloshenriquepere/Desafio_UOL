package com.carlos.oulhostbackend.repositories;

import com.carlos.oulhostbackend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
