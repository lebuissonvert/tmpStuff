package com.company.service;

import com.company.DAO.DeliberationDao;
import com.company.DAO.TauxDao;
import com.company.DTO.TauxDto;
import com.company.DTO.ZoneDto;
import com.company.entity.Deliberation;
import com.company.entity.Taux;

public class TauxService {
    private TauxDao tauxDao = new TauxDao();
    private ZoneService zoneService = new ZoneService();
    private DeliberationDao deliberationDao = new DeliberationDao();

    public Taux getTauxByDto(TauxDto tauxDto, Deliberation deliberation) {
        Taux resultat = null;
        if(tauxDto.getIdTaux() != null) {
            resultat = tauxDao.findTauxById(tauxDto.getIdTaux());
        } else {
            resultat = new Taux();
            resultat.setProp1("prop1");
            resultat.setProp2("prop2");
            if(tauxDto.getIdDeliberation() == null) {
                resultat.setDeliberation(deliberation);
            } else {
                resultat.setDeliberation(deliberationDao.findDeliberationById(tauxDto.getIdDeliberation()));
            }
            for(ZoneDto curZoneDto : tauxDto.getListeZones()) {
                resultat.getListeZones().add(zoneService.getZoneTauxFromDto(curZoneDto, resultat));
            }
        }
        return resultat;
    }
}
