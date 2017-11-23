package ed;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.mapPreview();

        controller.insertPlayers();

        System.out.println(controller.printMap());
    }
}
