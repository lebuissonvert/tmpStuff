package com.company;

import com.company.DAO.TauxDao;
import com.company.DTO.DeliberationDto;
import com.company.DTO.TauxDto;
import com.company.DTO.ZoneDto;
import com.company.entity.Deliberation;
import com.company.service.DeliberationService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().start(args);
    }

    private void start(String[] args) {
        DeliberationDto delibDto = new DeliberationDto();
        delibDto.setIdDeliberation(1);
        delibDto.setProp1("prop1 delib");

        TauxDto tauxDto = new TauxDto();
        //tauxDto.setIdTaux(11);
        tauxDto.setProp1("prop1 taux");
        tauxDto.setProp2("prop2 taux");
        delibDto.getListeTauxDto().add(tauxDto);

        ZoneDto zoneDto = new ZoneDto();
        //zoneDto.setIdZone(111);
        zoneDto.setProp1("prop1 zone");
        //zoneDto.setIdTaux(11);
        tauxDto.getListeZones().add(zoneDto);

        Deliberation delib = create(delibDto);
        int i=0;
        i++;
    }

    private Deliberation update(DeliberationDto delibDto){
        return new DeliberationService().updateDeliberation(delibDto);
    }

    private Deliberation create(DeliberationDto delibDto) {
        return new DeliberationService().creerDeliberation(delibDto);
    }
}
