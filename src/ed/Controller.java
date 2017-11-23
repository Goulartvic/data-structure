package ed;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Controller {

    Scanner scan = new Scanner(System.in);

    Map<Integer, Players> playersMap = new TreeMap<>();
    int index = 3;
    int[] salaryPattern = new int[]{
            5000, 8000, 10000, 15000, 20000
    };

    public void mapPreview() {
        Map<Integer, String> name1 = new TreeMap<>();
        name1.put(0,"Matheus");
        Map<Integer, String> team1 = new TreeMap<>();
        team1.put(0,"Palmeiras");
        Map<Integer, Integer> salary1 = new TreeMap<>();
        salary1.put(0, salaryPattern[2]);
        Players p1 = new Players(name1, team1, salary1);
        playersMap.put(0, p1);

        Map<Integer, String> name2 = new TreeMap<>();
        name2.put(1,"Gabriel");
        Map<Integer, String> team2 = new TreeMap<>();
        team2.put(1,"Vasco");
        Map<Integer, Integer> salary2 = new TreeMap<>();
        salary2.put(1, salaryPattern[1]);
        Players p2 = new Players(name2, team2, salary2);
        playersMap.put(1, p2);

        Map<Integer, String> name3 = new TreeMap<>();
        name3.put(2,"Richard");
        Map<Integer, String> team3 = new TreeMap<>();
        team3.put(2,"Internacional");
        Map<Integer, Integer> salary3 = new TreeMap<>();
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

        Map<Integer, Integer> insertSalary = new TreeMap<>();
        System.out.println("Insert a Salary ID");
        int idSalary = scan.nextInt();
        System.out.println("Choose a Salary: 1-$5000, 2-$8000, 3-$10000, 4-$15000, 5-$20000 ");
        int arrayIndex = scan.nextInt();
        switch (arrayIndex) {
            case 1:
                insertSalary.put(idSalary, salaryPattern[0]);
                break;
            case 2:
                insertSalary.put(idSalary, salaryPattern[1]);
                break;
            case 3:
                insertSalary.put(idSalary, salaryPattern[2]);
                break;
            case 4:
                insertSalary.put(idSalary, salaryPattern[3]);
                break;
            case 5:
                insertSalary.put(idSalary, salaryPattern[4]);
                break;
            default:
                System.out.println("This is not a valid salary");
        }

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
}
