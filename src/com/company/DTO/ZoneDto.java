package com.company.DTO;

import com.company.entity.Tarif;
import com.company.entity.Taux;

public class ZoneDto {
    private int idZone;
    private int idDelib;
    private TarifDto tarif;
    private TauxDto taux;
    private String prop1;

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public int getIdDelib() {
        return idDelib;
    }

    public void setIdDelib(int idDelib) {
        this.idDelib = idDelib;
    }

    public TarifDto getTarif() {
        return tarif;
    }

    public void setTarif(TarifDto tarif) {
        this.tarif = tarif;
    }

    public TauxDto getTaux() {
        return taux;
    }

    public void setTaux(TauxDto taux) {
        this.taux = taux;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
