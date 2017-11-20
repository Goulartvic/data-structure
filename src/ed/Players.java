package ed;

import java.util.Map;
import java.util.TreeMap;

public class Players {

    private Map<Integer, String> names = new TreeMap<>();
    private Map<Integer, String> teams = new TreeMap<>();
    private Map<Integer, Double> salary = new TreeMap<>();

    @Override
    public String toString() {
        return "Players{" +
                "salary=" + salary +
                ", teams=" + teams +
                ", names=" + names +
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

    public void putNames(Integer id, String name) {
        this.names.put(id, name);
    }

    public void putTeams(Integer id, String team) {
        this.teams.put(id, team);
    }

    public void putSalary(Integer id, Double salary) {
        this.salary.put(id, salary);
    }

    public void removeNameByKey(Integer id) {
        this.names.remove(id);
    }

    public void removeNameByKeyAndValue(Integer id, String name) {
        this.names.remove(id, name);
    }

    public void removeTeamByKey(Integer id) {
        this.teams.remove(id);
    }

    public void removeTeamByKeyAndValue(Integer id, String team) {
        this.teams.remove(id, team);
    }

    public void removeSalaryByKey(Integer id) {
        this.salary.remove(id);
    }

    public void removeSalaryByKeyAndValue(Integer id, Double salary) {
        this.salary.remove(id, salary);
    }


}
