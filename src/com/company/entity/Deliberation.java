package com.company.entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Deliberation {
    private int idDeliberation;
    private String prop1;
    private String prop2;
    private Set<Taux> listeTaux = new LinkedHashSet<>();
    private Set<Exoneration> listeExoneration = new LinkedHashSet<>();
    private Tarif tarif;

    public int getIdDeliberation() {
        return idDeliberation;
    }

    public void setIdDeliberation(int idDeliberation) {
        this.idDeliberation = idDeliberation;
    }

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

    public Set<Taux> getListeTaux() {
        return listeTaux;
    }

    public void setListeTaux(Set<Taux> listeTaux) {
        this.listeTaux.clear();
        this.listeTaux.addAll(listeTaux);
    }

    public Set<Exoneration> getListeExoneration() {
        return listeExoneration;
    }

    public void setListeExoneration(Set<Exoneration> listeExoneration) {
        this.listeExoneration.clear();
        this.listeExoneration.addAll(listeExoneration);
    }

    public Tarif getTarif() {
        return tarif;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }
}
