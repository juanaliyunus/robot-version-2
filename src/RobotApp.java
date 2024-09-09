import java.util.Scanner;

public class RobotApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tentukan posisi awal Robot (arah, x, y): ");
        String[] initialPosition = scanner.nextLine().split(",");
        Direction direction = Direction.valueOf(initialPosition[0].toUpperCase());
        int x = Integer.parseInt(initialPosition[1]);
        int y = Integer.parseInt(initialPosition[2]);

        Robot robot = new Robot(direction, x, y);

        System.out.print("Input perintah: ");
        String commands = scanner.nextLine();

        for (char command : commands.toCharArray()) {
            robot.executeCommand(command);
        }

        scanner.close();
    }
}