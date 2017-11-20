package model;

import java.util.Map;
import java.util.TreeMap;

public class Players {

    private Map<Integer, Double> salary = new TreeMap<Integer, Double>();
    private Map<Integer, String> teams = new TreeMap<Integer, String>();
    private Map<Integer, String> names = new TreeMap<Integer, String>();

    public void mapPreview() {
        names.put(1, "Jake");
        names.put(2, "Jack");
        names.put(2, "John");

        teams.put(1, "São Paulo");
        teams.put(2, "Avai");
        teams.put(3, "Vasco");

        salary.put(1, 10000.00);
        salary.put(2, 5000.00);
        salary.put(3, 7500.00);
    }

    @Override
    public String toString() {
        return "Players{" +
                "salary=" + salary +
                ", teams=" + teams +
                ", names=" + names +
                '}';
    }
}
