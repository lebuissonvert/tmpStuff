package com.company;

public enum EnumBudget {
    C("C", 5),
    A("A", 4),
    G("G", 6),
    BEJ("BEJ", 1),
    BP("BP", 2),
    LMNP("LMNP", 3);

    private String code;
    private int sortOrder;

    private EnumBudget(String p_code, int p_sortOrder) {
        code = p_code;
        sortOrder = p_sortOrder;
    }

    /* BP LMNP BEJ A C G*/
    public static EnumBudget findEnumBudgetByJasperCode(String code) {
        EnumBudget result = null;
        if(code!=null) {
            if(code.toUpperCase().equals("BP") ) {
                result = EnumBudget.BP;
            } else if(code.toUpperCase().equals("C")) {
                result = EnumBudget.C;
            } else if(code.toUpperCase().equals("A")) {
                result = EnumBudget.A;
            } else if(code.toUpperCase().equals("G")) {
                result = EnumBudget.G;
            } else if(code.toUpperCase().equals("BEJ")) {
                result = EnumBudget.BEJ;
            } else if(code.toUpperCase().equals("LMNP")) {
                result = EnumBudget.LMNP;
            }
        }
        return result;
    }

    /* * L M N P B E J A C G*/
    public static EnumBudget findEnumBudgetByTableCode(String code) {
        EnumBudget result = null;
        if(code!=null) {
            if(code.toUpperCase().equals("*") ||code.toUpperCase().equals("BP")) {
                result = EnumBudget.BP;
            } else if(code.toUpperCase().equals("C")) {
                result = EnumBudget.C;
            } else if(code.toUpperCase().equals("A")) {
                result = EnumBudget.A;
            } else if(code.toUpperCase().equals("G")) {
                result = EnumBudget.G;
            } else if(code.toUpperCase().equals("B") || code.toUpperCase().equals("E")
                    || code.toUpperCase().equals("J")) {
                result = EnumBudget.BEJ;
            } else if(code.toUpperCase().equals("L") || code.toUpperCase().equals("M")
                    || code.toUpperCase().equals("N") || code.toUpperCase().equals("P")) {
                result = EnumBudget.LMNP;
            }
        }
        return result;
    }

    public static String getCode(EnumBudget enumBudget) {
        return enumBudget.code;
    }

    public static int getSortOrder(EnumBudget enumBudget) {
        return enumBudget.sortOrder;
    }
}
