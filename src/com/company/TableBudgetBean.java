package com.company;

public class TableBudgetBean {
    private String idBudget;
    private String exercice;
    private String idEtab;
    private String codeBudget;
    private String libelleBudget;

    private TableBudgetBean() {
    }

    public TableBudgetBean(String idBudget, String exercice, String idEtab, String codeBudget, String libelleBudget) {
        this.idBudget = idBudget;
        this.exercice = exercice;
        this.idEtab = idEtab;
        this.codeBudget = codeBudget;
        this.libelleBudget = libelleBudget;
    }

    public String getIdBudget() {
        return idBudget;
    }

    public String getExercice() {
        return exercice;
    }

    public String getIdEtab() {
        return idEtab;
    }

    public String getCodeBudget() {
        return codeBudget;
    }

    public String getLibelleBudget() {
        return libelleBudget;
    }
}
