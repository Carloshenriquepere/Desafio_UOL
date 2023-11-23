package com.carlos.oulhostbackend.model;


import com.carlos.oulhostbackend.model.DTOs.PlayerDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity(name = "players")
@Table(name = "players")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private String phoneNumber;
    private String codename;
    private GroupType groupType;

    public Player(PlayerDTO dto) {
        this.name = dto.name();
        this.email = dto.email();
        this.phoneNumber = dto.phoneNumber();
        this.groupType = dto.groupType();
    }
}
