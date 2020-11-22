package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().start(args);
    }

    private void start(String[] args) {
        TableBudgetBean tbBeanA1 = new TableBudgetBean(
                "idBudgetA", "2019", "idEtab", "A", "libelle Budget A 2019");
        TableBudgetBean tbBeanA2 = new TableBudgetBean(
                "idBudgetA", "2018", "idEtab", "A", "libelle Budget A 2018");
        TableBudgetBean tbBeanA3 = new TableBudgetBean(
                "idBudgetA", "2017", "idEtab", "A", "libelle Budget A 2017");
        TableBudgetBean tbBeanStar = new TableBudgetBean(
                "idBudgetStar", "2019", "idEtab", "*", "libelle Budget * 2019");
        TableBudgetBean tbBeanL = new TableBudgetBean(
                "idBudgetL", "2019", "idEtab", "L", "libelle Budget L 2019");
        TableBudgetBean tbBeanP = new TableBudgetBean(
                "idBudgetP", "2019", "idEtab", "P", "libelle Budget P 2019");
        TableBudgetBean tbBeanL2 = new TableBudgetBean(
                "idBudgetL2", "2015", "idEtab", "L", "libelle Budget L 2015");
        TableBudgetBean tbBeanL3 = new TableBudgetBean(
                "idBudgetL2", "2016", "idEtab", "L", "libelle Budget L 2016");
        List<TableBudgetBean> listeTableBudgetBean = new ArrayList<>();
        listeTableBudgetBean.add(tbBeanA1);
        listeTableBudgetBean.add(tbBeanA2);
        listeTableBudgetBean.add(tbBeanA3);
        listeTableBudgetBean.add(tbBeanStar);
        listeTableBudgetBean.add(tbBeanL);
        listeTableBudgetBean.add(tbBeanP);
        listeTableBudgetBean.add(tbBeanL2);
        listeTableBudgetBean.add(tbBeanL3);

        List<JasperBudgetBean> listeJasperBudgetBean =
                convertListeTableBudgetBeanToListeJasperBudgetBean(listeTableBudgetBean);
        int i=0;
    }

    private List<JasperBudgetBean> convertListeTableBudgetBeanToListeJasperBudgetBean(
            List<TableBudgetBean> listeTableBudgetBean) {
        List<JasperBudgetBean> result = new ArrayList<>();

        /**
         * Faire une map <idBudget, liste TableBudgetBean> (HashMap suffisant)
         * Itéter la map :
         *      - pour chacun des élements (liste), créer un JasperBudgetBean à partir des éléments de la liste
         *      - ajouter cet éléménent créé dans result
         * Sort result
         * return result
        */

        Map<String, List<TableBudgetBean>> mapTableBudgetBeanByIdBudget = new HashMap<>();
        for(TableBudgetBean curTableBudgetBean : listeTableBudgetBean) {
            if(!mapTableBudgetBeanByIdBudget.containsKey(curTableBudgetBean.getIdBudget())) {
                mapTableBudgetBeanByIdBudget.put(curTableBudgetBean.getIdBudget(), new ArrayList<TableBudgetBean>());
            }
            if(curTableBudgetBean!=null) {
                mapTableBudgetBeanByIdBudget.get(curTableBudgetBean.getIdBudget()).add(curTableBudgetBean);
            }
        }

        for(Map.Entry<String, List<TableBudgetBean>> curEntry : mapTableBudgetBeanByIdBudget.entrySet()) {
            if(!curEntry.getValue().isEmpty()) {
                result.add(new JasperBudgetBean(
                        curEntry.getKey(),
                        getCodeBudgetFinalParExerciceEtIdBudget(
                                listeTableBudgetBean,
                                curEntry.getValue().get(0).getExercice(),
                                curEntry.getKey()),
                        getLibelleBudgetParExerciceEtIdBudget(
                                listeTableBudgetBean,
                                "2015",
                                curEntry.getKey()),
                        getLibelleBudgetParExerciceEtIdBudget(
                                listeTableBudgetBean,
                                "2016",
                                curEntry.getKey()),
                        getLibelleBudgetParExerciceEtIdBudget(
                                listeTableBudgetBean,
                                "2017",
                                curEntry.getKey()),
                        getLibelleBudgetParExerciceEtIdBudget(
                                listeTableBudgetBean,
                                "2018",
                                curEntry.getKey()),
                        getLibelleBudgetParExerciceEtIdBudget(
                                listeTableBudgetBean,
                                "2019",
                                curEntry.getKey())
                ));
            }
        }

        Collections.sort(result, new JasperBudgetBeanComparator());
        return result;
    }

    private String getLibelleBudgetParExerciceEtIdBudget(
            List<TableBudgetBean> listeTableBudgetBean, String exercice, String idBudget) {
        String result = null;
        for(TableBudgetBean curTableBudgetBean : listeTableBudgetBean) {
            if(exercice.equals(curTableBudgetBean.getExercice()) && idBudget.equals(curTableBudgetBean.getIdBudget())) {
                result = curTableBudgetBean.getLibelleBudget();
            }
        }
        return result == null ? "" : result;
    }

    private String getCodeBudgetFinalParExerciceEtIdBudget(
            List<TableBudgetBean> listeTableBudgetBean, String exercice, String idBudget) {
        String result = null;
        for(TableBudgetBean curTableBudgetBean : listeTableBudgetBean) {
            if(exercice.equals(curTableBudgetBean.getExercice()) && idBudget.equals(curTableBudgetBean.getIdBudget())) {
                result = EnumBudget.getCode(
                        EnumBudget.findEnumBudgetByTableCode(curTableBudgetBean.getCodeBudget()));
            }
        }
        return result == null ? "" : result;
    }
}
