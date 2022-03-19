package com.company.DTO;

import java.util.ArrayList;
import java.util.List;

public class TauxDto {
    private Integer idTaux;
    private Integer idDeliberation;
    private List<ZoneDto> listeZones = new ArrayList<>();

    public Integer getIdDeliberation() {
        return idDeliberation;
    }

    public void setIdDeliberation(Integer idDeliberation) {
        this.idDeliberation = idDeliberation;
    }

    public List<ZoneDto> getListeZones() {
        return listeZones;
    }

    public void setListeZones(List<ZoneDto> listeZones) {
        this.listeZones.clear();
        this.listeZones.addAll(listeZones);
    }

    public Integer getIdTaux() {
        return idTaux;
    }

    public void setIdTaux(Integer idTaux) {
        this.idTaux = idTaux;
    }
}
