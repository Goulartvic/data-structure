package ed;

import java.util.Scanner;

public class Controller {

    Scanner scan = new Scanner(System.in);

    Players players = new Players();

    public void mapPreview() {
        players.putNames(1, "Jake");
        players.putNames(2, "Jack");
        players.putNames(3, "John");

        players.putTeams(1, "São Paulo");
        players.putTeams(2, "Avai");
        players.putTeams(3, "Vasco");

        players.putSalary(1, 10000.00);
        players.putSalary(2, 5000.00);
        players.putSalary(3, 7500.00);
    }

    public void putPlayerParameter() {
        System.out.println("Insert a name and an ID");
        players.putNames(scan.nextInt(), scan.nextLine());
        System.out.println("Insert a team and an ID");
        players.putTeams(scan.nextInt(), scan.nextLine());
        System.out.println("Insert a salary and an ID");
        players.putSalary(scan.nextInt(), scan.nextDouble());
    }


}
