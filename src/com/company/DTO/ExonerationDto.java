package com.company.DTO;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExonerationDto {
    private Integer idExoneration;
    private Integer idDeliberation;
    private Set<ZoneDto> zonesDto = new LinkedHashSet<>();
    private String prop1;
    private String prop2;

    public Integer getIdDeliberation() {
        return idDeliberation;
    }

    public void setIdDeliberation(Integer idDeliberation) {
        this.idDeliberation = idDeliberation;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public Integer getIdExoneration() {
        return idExoneration;
    }

    public void setIdExoneration(Integer idExoneration) {
        this.idExoneration = idExoneration;
    }

    public Set<ZoneDto> getListeZonesDto() {
        return zonesDto;
    }

    public void setZonesDto(Set<ZoneDto> zonesDto) {
        this.zonesDto = zonesDto;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
}
