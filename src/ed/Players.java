package ed;

import java.util.Map;
import java.util.TreeMap;

public class Players {

    private Map<Integer, String> names = new TreeMap<>();
    private Map<Integer, String> teams = new TreeMap<>();
    private Map<Integer, Double> salary = new TreeMap<>();

    public Players(Map<Integer, String> names, Map<Integer, String> teams, Map<Integer, Double> salary) {
        this.names = names;
        this.teams = teams;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Players{" +
                "names=" + names +
                ", teams=" + teams +
                ", salary=" + salary +
                '}';
    }

    public Map<Integer, Double> getSalary() {
        return salary;
    }

    public void setSalary(Map<Integer, Double> salary) {
        this.salary = salary;
    }

    public Map<Integer, String> getTeams() {
        return teams;
    }

    public void setTeams(Map<Integer, String> teams) {
        this.teams = teams;
    }

    public Map<Integer, String> getNames() {
        return names;
    }

    public void setNames(Map<Integer, String> names) {
        this.names = names;
    }
}
