package com.company;

import java.util.Comparator;

public class JasperBudgetBeanComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return Integer.compare(
                EnumBudget.getSortOrder(EnumBudget.findEnumBudgetByJasperCode(((JasperBudgetBean)o1).getCodeBudget())),
                EnumBudget.getSortOrder(EnumBudget.findEnumBudgetByJasperCode(((JasperBudgetBean)o2).getCodeBudget()))
        );
    }

}
