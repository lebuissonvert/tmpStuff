package com.company.entity;

public class Zone {
    private int idZone;
    private int idDelib;
    private Tarif tarif;
    private Taux taux;
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

    public Tarif getTarif() {
        return tarif;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }

    public Taux getTaux() {
        return taux;
    }

    public void setTaux(Taux taux) {
        this.taux = taux;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
