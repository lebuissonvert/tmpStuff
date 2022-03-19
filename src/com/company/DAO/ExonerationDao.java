package com.company.DAO;

import com.company.entity.Exoneration;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExonerationDao {
    public Exoneration findExonerationById(int id) {
        return new Exoneration();
    }

    public Set<Exoneration> findExonerationsById(List<Integer> ids) {
        return new LinkedHashSet<>();
    }
}
