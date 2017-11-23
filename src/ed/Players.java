package ed;

import java.util.Map;
import java.util.TreeMap;

public class Players {

    private Map<Integer, String> names = new TreeMap<>();
    private Map<Integer, String> teams = new TreeMap<>();
    private Map<Integer, String> salary = new TreeMap<>();

    public Players(Map<Integer, String> names, Map<Integer, String> teams, Map<Integer, String> salary) {
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

    public Map<Integer, String> getNames() {
        return names;
    }

    public Map<Integer, String> getTeams() {
        return teams;
    }

    public Map<Integer, String> getSalary() {
        return salary;
    }
}
