package com.company.service;

import com.company.DAO.DeliberationDao;
import com.company.DAO.ExonerationDao;
import com.company.DTO.ExonerationDto;
import com.company.DTO.ZoneDto;
import com.company.entity.Deliberation;
import com.company.entity.Exoneration;

public class ExonerationService {
    private ExonerationDao exonerationDao = new ExonerationDao();
    private DeliberationDao deliberationDao = new DeliberationDao();
    private ZoneService zoneService = new ZoneService();

    public Exoneration getExonerationByDto(ExonerationDto exonerationDto, Deliberation deliberation) {
        Exoneration resultat = null;
        if(exonerationDto.getIdExoneration() != null) {
            resultat = exonerationDao.findExonerationById(exonerationDto.getIdExoneration());
        } else {
            resultat = new Exoneration();
            resultat.setProp1("prop1");
            resultat.setProp2("prop2");
            if(exonerationDto.getIdDeliberation() == null) {
                resultat.setDeliberation(deliberation);
            } else {
                resultat.setDeliberation(deliberationDao.findDeliberationById(exonerationDto.getIdDeliberation()));
            }
            for(ZoneDto curZoneDto : exonerationDto.getListeZonesDto()) {
                resultat.getListeZones().add(zoneService.getZoneExonerationFromDto(curZoneDto, resultat));
            }
        }
        return resultat;
    }
}
