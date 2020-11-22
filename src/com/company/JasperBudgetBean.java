package com.company;

public class JasperBudgetBean {
    private String idBudget;
    private String codeBudget;
    private String denomNm1;
    private String denomNm2;
    private String denomNm3;
    private String denomNm4;
    private String denomNm5;

    private JasperBudgetBean(){}

    public JasperBudgetBean(
            String idBudget, String codeBudget, String denomNm1, String denomNm2,
            String denomNm3, String denomNm4, String denomNm5) {
        this.idBudget = idBudget;
        this.codeBudget = codeBudget;
        this.denomNm1 = denomNm1;
        this.denomNm2 = denomNm2;
        this.denomNm3 = denomNm3;
        this.denomNm4 = denomNm4;
        this.denomNm5 = denomNm5;
    }

    public String getCodeBudget() {
        return codeBudget;
    }

    public void setCodeBudget(String codeBudget) {
        this.codeBudget = codeBudget;
    }

    public String getDenomNm1() {
        return denomNm1;
    }

    public void setDenomNm1(String denomNm1) {
        this.denomNm1 = denomNm1;
    }

    public String getDenomNm2() {
        return denomNm2;
    }

    public void setDenomNm2(String denomNm2) {
        this.denomNm2 = denomNm2;
    }

    public String getDenomNm3() {
        return denomNm3;
    }

    public void setDenomNm3(String denomNm3) {
        this.denomNm3 = denomNm3;
    }

    public String getDenomNm4() {
        return denomNm4;
    }

    public void setDenomNm4(String denomNm4) {
        this.denomNm4 = denomNm4;
    }

    public String getDenomNm5() {
        return denomNm5;
    }

    public void setDenomNm5(String denomNm5) {
        this.denomNm5 = denomNm5;
    }

    public String getIdBudget() {
        return idBudget;
    }
}
