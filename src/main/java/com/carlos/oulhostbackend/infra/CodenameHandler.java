package com.carlos.oulhostbackend.infra;

import com.carlos.oulhostbackend.model.GroupType;
import com.carlos.oulhostbackend.service.CodenameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CodenameHandler {

    @Autowired
    private CodenameService codenameService;


    public String findCodename(GroupType groupType) {
        if (groupType == GroupType.AVENGERS){
            String firstMatch = codenameService.getAvengersCodenameList().stream().findFirst().orElseThrow();
            this.codenameService.getAvengersCodenameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = codenameService.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.codenameService.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
