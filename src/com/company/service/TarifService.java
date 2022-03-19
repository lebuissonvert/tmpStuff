package com.company.service;

import com.company.DAO.DeliberationDao;
import com.company.DAO.TarifDao;
import com.company.DTO.TarifDto;
import com.company.DTO.ZoneDto;
import com.company.entity.Deliberation;
import com.company.entity.Tarif;

public class TarifService {
    private TarifDao tarifDao = new TarifDao();
    private DeliberationDao deliberationDao = new DeliberationDao();
    private ZoneService zoneService = new ZoneService();

    public Tarif getTarifByDto(TarifDto tarifDto, Deliberation deliberation) {
        Tarif resultat = null;
        if(tarifDto.getIdTarif() != null) {
            resultat = tarifDao.findTarifById(tarifDto.getIdTarif());
        } else {
            resultat = new Tarif();
            resultat.setProp1("prop1");
            resultat.setProp2("prop2");
            if(tarifDto.getIdDeliberation() == null) {
                resultat.setDeliberation(deliberation);
            } else {
                resultat.setDeliberation(deliberationDao.findDeliberationById(tarifDto.getIdDeliberation()));
            }
            for(ZoneDto curZoneDto : tarifDto.getListeZones()) {
                resultat.getListeZones().add(zoneService.getZoneTarifFromDto(curZoneDto, resultat));
            }
        }
        return resultat;
    }
}
