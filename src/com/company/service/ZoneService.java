package com.company.service;

import com.company.DAO.ExonerationDao;
import com.company.DAO.TarifDao;
import com.company.DAO.TauxDao;
import com.company.DAO.ZoneDao;
import com.company.DTO.ZoneDto;
import com.company.entity.Exoneration;
import com.company.entity.Tarif;
import com.company.entity.Taux;
import com.company.entity.Zone;

import java.util.LinkedHashSet;
import java.util.Set;

public class ZoneService {
    private ZoneDao zoneDao = new ZoneDao();
    private TauxDao tauxDao = new TauxDao();
    private TarifDao tarifDao = new TarifDao();
    private ExonerationDao exonerationDao = new ExonerationDao();

    public Zone getZoneTauxFromDto(ZoneDto zoneDto, Taux taux) {
        Zone resultat = null;
        if(zoneDto.getIdZone() != null) {
            resultat = zoneDao.findZoneById(zoneDto.getIdZone());
        } else {
            resultat = new Zone();
            //resultat.setIdZone(zoneDto.getIdZone()); pas d'id sur une création (ou 0)
            resultat.setIdDelib(zoneDto.getIdDelib());
            resultat.setProp1(zoneDto.getProp1());
            if(zoneDto.getIdTaux() == null || zoneDto.getIdTaux() == null) {
                // Création d'une zone d'un taux en cours de creation
                resultat.setTaux(taux);
            } else {
                resultat.setTaux(tauxDao.findTauxById(zoneDto.getIdTaux()));
            }
            if(zoneDto.getIdTarif() != null && zoneDto.getIdTarif() != null) {
                resultat.setTarif(tarifDao.findTarifById(zoneDto.getIdTarif()));
                // si problème de recursion ici, alors créer dans TarifService un service qui retourne les Tarif sans Zone
            }
            if(zoneDto.getIdsExoneration() != null && !zoneDto.getIdsExoneration().isEmpty()) {
                resultat.setExonerations(exonerationDao.findExonerationsById(zoneDto.getIdsExoneration()));
                // si problème de recursion ici, alors créer dans TarifService un service qui retourne les Tarif sans Zone
            }
        }
        return resultat;
    }

    public Zone getZoneTarifFromDto(ZoneDto zoneDto, Tarif tarif) {
        Zone resultat = null;
        if(zoneDto.getIdZone() != null) {
            resultat = zoneDao.findZoneById(zoneDto.getIdZone());
        } else {
            resultat = new Zone();
            //resultat.setIdZone(zoneDto.getIdZone()); pas d'id sur une création (ou 0)
            resultat.setIdDelib(zoneDto.getIdDelib());
            resultat.setProp1(zoneDto.getProp1());
            if(zoneDto.getIdTarif() == null || zoneDto.getIdTarif() == null) {
                // Création d'une zone d'un tarif en cours de creation
                resultat.setTarif(tarif);
            } else {
                resultat.setTarif(tarifDao.findTarifById(zoneDto.getIdTarif()));
            }
            if(zoneDto.getIdTaux() != null && zoneDto.getIdTaux() != null) {
                resultat.setTaux(tauxDao.findTauxById(zoneDto.getIdTaux()));
                // si problème de recursion ici, alors créer dans TauxService un service qui retourne les Taux sans Zone
            }
            if(zoneDto.getIdsExoneration() != null && !zoneDto.getIdsExoneration().isEmpty()) {
                resultat.setExonerations(exonerationDao.findExonerationsById(zoneDto.getIdsExoneration()));
                // si problème de recursion ici, alors créer dans TarifService un service qui retourne les Tarif sans Zone
            }
        }
        return resultat;
    }

    public Zone getZoneExonerationFromDto(ZoneDto zoneDto, Exoneration exoneration) {
        Zone resultat = null;
        if(zoneDto.getIdZone() != null) {
            resultat = zoneDao.findZoneById(zoneDto.getIdZone());
        } else {
            resultat = new Zone();
            //resultat.setIdZone(zoneDto.getIdZone()); pas d'id sur une création (ou 0)
            resultat.setIdDelib(zoneDto.getIdDelib());
            resultat.setProp1(zoneDto.getProp1());
            if(zoneDto.getIdTaux() != null && zoneDto.getIdTaux() != null) {
                resultat.setTaux(tauxDao.findTauxById(zoneDto.getIdTaux()));
                // si problème de recursion ici, alors créer dans TauxService un service qui retourne les Taux sans Zone
            }
            if(zoneDto.getIdTarif() != null && zoneDto.getIdTarif() != null) {
                resultat.setTarif(tarifDao.findTarifById(zoneDto.getIdTarif()));
                // si problème de recursion ici, alors créer dans TarifService un service qui retourne les Tarif sans Zone
            }
            if(zoneDto.getIdsExoneration() == null || zoneDto.getIdsExoneration().isEmpty()) {
                // Création d'une zone d'une exoneration en cours de creation
                Set<Exoneration> setExonerations = new LinkedHashSet<>();
                setExonerations.add(exoneration);
                resultat.setExonerations(setExonerations);
            } else {
                resultat.setExonerations(exonerationDao.findExonerationsById(zoneDto.getIdsExoneration()));
            }
        }
        return resultat;
    }
}
