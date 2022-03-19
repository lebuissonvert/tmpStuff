package com.company.DAO;

import com.company.entity.Zone;

public class ZoneDao {
    public Zone findZoneById(int id) {
        Zone zone = new Zone();
        zone.setIdZone(id);
        return zone;
    }
}
