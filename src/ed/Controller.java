package ed;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Controller {

    Scanner scan = new Scanner(System.in);

    Map<Integer, Players> playersMap = new TreeMap<>();
    int index = 3;
    String[] salaryPattern = new String[]{
            "5000", "8000", "10000", "15000", "20000"
    };

    public void mapPreview() {
        Map<Integer, String> name1 = new TreeMap<>();
        name1.put(0,"Matheus");
        Map<Integer, String> team1 = new TreeMap<>();
        team1.put(0,"Palmeiras");
        Map<Integer, String> salary1 = new TreeMap<>();
        salary1.put(0, salaryPattern[2]);
        Players p1 = new Players(name1, team1, salary1);
        playersMap.put(0, p1);

        Map<Integer, String> name2 = new TreeMap<>();
        name2.put(1,"Gabriel");
        Map<Integer, String> team2 = new TreeMap<>();
        team2.put(1,"Vasco");
        Map<Integer, String> salary2 = new TreeMap<>();
        salary2.put(1, salaryPattern[1]);
        Players p2 = new Players(name2, team2, salary2);
        playersMap.put(1, p2);

        Map<Integer, String> name3 = new TreeMap<>();
        name3.put(2,"Richard");
        Map<Integer, String> team3 = new TreeMap<>();
        team3.put(2,"Internacional");
        Map<Integer, String> salary3 = new TreeMap<>();
        salary3.put(2, salaryPattern[3]);
        Players p3 = new Players(name3, team3, salary3);
        playersMap.put(2, p3);
    }

    public void insertPlayers() {
        Map<Integer, String> insertName = new TreeMap<>();
        System.out.println("Insert a Player ID");
        int idName = scan.nextInt();
        System.out.println("Insert a Player Name");
        String name = scan.next();
        insertName.put(idName, name);

        Map<Integer, String> insertTeam = new TreeMap<>();
        System.out.println("Insert a Team ID");
        int idTeam = scan.nextInt();
        System.out.println("Insert a Team Name");
        String team = scan.next();
        insertTeam.put(idTeam, team);

        Map<Integer, String> insertSalary = new TreeMap<>();
        System.out.println("Insert a Salary ID");
        int idSalary = scan.nextInt();
        System.out.println("Choose a Salary: 1-$5000, 2-$8000, 3-$10000, 4-$15000, 5-$20000 ");
        int arrayIndex = scan.nextInt();

        insertSalary.put(idSalary, salaryPattern[arrayIndex - 1]);

        Players insertPlayer = new Players(insertName, insertTeam, insertSalary);

        playersMap.put(index, insertPlayer);
        index++;
    }

    public void removePlayer() {
        System.out.println("Enter the Player ID to remove it");
        playersMap.remove(scan.nextInt());
    }

    public Map<Integer, Players> printMap() {
        return playersMap;
    }

    public Map<Integer, Players> filterByName() {
        System.out.println("Insert Player Name:");

        final String name = scan.next();

        Map<Integer, Players> mapFilterByName;

        mapFilterByName = playersMap.entrySet()
                .stream()
                    .filter(o -> o.getValue().getNames().get(o.getKey()).equals(name))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue
                        ));

        return mapFilterByName;
    }

    public Map<Integer, Players> filterByTeam() {
        System.out.println("Insert Player Team:");

        final String team = scan.next();

        Map<Integer, Players> mapFilterByName;

        mapFilterByName = playersMap.entrySet()
                .stream()
                .filter(o -> o.getValue().getTeams().get(o.getKey()).equals(team))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue
                ));

        return mapFilterByName;
    }

    public Map<Integer, Players> filterBySalary() {
        System.out.println("Choose a Salary: 1-$5000, 2-$8000, 3-$10000, 4-$15000, 5-$20000");
        int salaryIndex = scan.nextInt();
        Map<Integer, Players> mapFilterBySalary;

        mapFilterBySalary = playersMap.entrySet()
                .stream()
                .filter(o -> o.getValue().getSalary().get(o.getKey()).equals(salaryPattern[salaryIndex - 1]))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue
                ));

        return mapFilterBySalary;
    }
}
