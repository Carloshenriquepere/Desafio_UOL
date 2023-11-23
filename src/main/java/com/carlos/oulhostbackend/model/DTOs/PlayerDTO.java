package com.carlos.oulhostbackend.model.DTOs;

import com.carlos.oulhostbackend.model.GroupType;

public record PlayerDTO(

        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
