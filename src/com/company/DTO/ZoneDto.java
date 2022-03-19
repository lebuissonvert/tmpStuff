package com.company.DTO;

import java.util.List;

public class ZoneDto {
    private Integer idZone;
    private int idDelib;
    private Integer idTarif;
    private Integer idTaux;
    private List<Integer> idsExoneration;
    private String prop1;

    public List<Integer> getIdsExoneration() {
        return idsExoneration;
    }

    public void setIdsExoneration(List<Integer> idsExoneration) {
        this.idsExoneration = idsExoneration;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    public int getIdDelib() {
        return idDelib;
    }

    public void setIdDelib(int idDelib) {
        this.idDelib = idDelib;
    }

    public Integer getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(Integer idTarif) {
        this.idTarif = idTarif;
    }

    public Integer getIdTaux() {
        return idTaux;
    }

    public void setIdTaux(Integer idTaux) {
        this.idTaux = idTaux;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
