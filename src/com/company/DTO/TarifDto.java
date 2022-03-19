package com.company.DTO;

import java.util.ArrayList;
import java.util.List;

public class TarifDto {
    private Integer idTarif;
    private Integer idDeliberation;
    private List<ZoneDto> listeZones = new ArrayList<>();

    public Integer getIdDeliberation() {
        return idDeliberation;
    }

    public void setIdDeliberation(Integer idDeliberation) {
        this.idDeliberation = idDeliberation;
    }

    public Integer getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(Integer idTarif) {
        this.idTarif = idTarif;
    }

    public List<ZoneDto> getListeZones() {
        return listeZones;
    }

    public void setListeZones(List<ZoneDto> listeZones) {
        this.listeZones.clear();
        this.listeZones.addAll(listeZones);
    }
}
