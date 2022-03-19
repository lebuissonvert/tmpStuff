package com.company.service;

import com.company.DTO.DeliberationDto;
import com.company.DTO.ExonerationDto;
import com.company.DTO.TauxDto;
import com.company.entity.Deliberation;
import com.company.entity.Exoneration;
import com.company.entity.Tarif;
import com.company.entity.Taux;

import java.util.LinkedHashSet;
import java.util.Set;


public class DeliberationService {
    private TauxService tauxService = new TauxService();
    private TarifService tarifService = new TarifService();
    private ExonerationService exonerationService = new ExonerationService();

    public void creerDeliberation(DeliberationDto deliberationDto) {
        Deliberation deliberation = new Deliberation();

        Set<Taux> taux = new LinkedHashSet<>();
        for(TauxDto curTauxDto : deliberationDto.getListeTauxDto()) {
            taux.add(tauxService.getTauxByDto(curTauxDto, deliberation));
        }

        Tarif tarif = null;
        if(deliberationDto.getTarifDto() != null) {
            tarif = tarifService.getTarifByDto(deliberationDto.getTarifDto(), deliberation);
        }

        Set<Exoneration> exonerations = new LinkedHashSet<>();
        for(ExonerationDto curExonerationDto : deliberationDto.getListeExonerationDto()) {
            exonerations.add(exonerationService.getExonerationByDto(curExonerationDto, deliberation));
        }

        deliberation.setListeTaux(taux);
        deliberation.setTarif(tarif);
        deliberation.setListeExoneration(exonerations);
        deliberation.setProp1(deliberationDto.getProp1());
        deliberation.setProp2(deliberationDto.getProp2());
    }
}
