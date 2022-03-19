package com.company.DAO;

import com.company.entity.Taux;

public class TauxDao {
    public Taux findTauxById(int id) {
        Taux taux = new Taux();
        taux.setIdTaux(id);
        return taux;
    }
}
