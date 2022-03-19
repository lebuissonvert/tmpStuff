package com.company.entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Taux {
    private int idTaux;

    public int getIdTaux() {
        return idTaux;
    }

    public void setIdTaux(int idTaux) {
        this.idTaux = idTaux;
    }

    private String prop1;
    private String prop2;
    private Set<Zone> listeZones = new LinkedHashSet<>();

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

    public Set<Zone> getListeZones() {
        return listeZones;
    }

    public void setListeZones(Set<Zone> listeZones) {
        this.listeZones.clear();
        this.listeZones.addAll(listeZones);
    }
}
