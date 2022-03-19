package com.company.DTO;

import java.util.ArrayList;
import java.util.List;

public class TarifDto {
    private Integer idTarif;
    private Integer idDeliberation;
    private List<ZoneDto> listeZones = new ArrayList<>();
    private String prop1;
    private String prop2;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

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
