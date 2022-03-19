package com.company.DTO;


import java.util.ArrayList;
import java.util.List;

public class DeliberationDto {
    private Integer idDeliberation;
    private String prop1;
    private String prop2;
    private List<TauxDto> listeTauxDto = new ArrayList<>();
    private List<ExonerationDto> listeExonerationDto = new ArrayList<>();
    private TarifDto tarifDto;

    public Integer getIdDeliberation() {
        return idDeliberation;
    }

    public void setIdDeliberation(Integer idDeliberation) {
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

    public List<TauxDto> getListeTauxDto() {
        return listeTauxDto;
    }

    public void setListeTauxDto(List<TauxDto> listeTauxDto) {
        this.listeTauxDto = listeTauxDto;
    }

    public List<ExonerationDto> getListeExonerationDto() {
        return listeExonerationDto;
    }

    public void setListeExonerationDto(List<ExonerationDto> listeExonerationDto) {
        this.listeExonerationDto = listeExonerationDto;
    }

    public TarifDto getTarifDto() {
        return tarifDto;
    }

    public void setTarifDto(TarifDto tarifDto) {
        this.tarifDto = tarifDto;
    }
}
