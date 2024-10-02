import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(new Position(2, 2));
        grid.addObstacle(new Position(3, 5));

        Rover rover = new Rover(0, 0, Direction.NORTH, grid);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter commands (M = Move, L = Turn Left, R = Turn Right): ");
        String commands = scanner.nextLine();

        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'M':
                    rover.executeCommand(new MoveCommand());
                    break;
                case 'L':
                    rover.executeCommand(new TurnLeftCommand());
                    break;
                case 'R':
                    rover.executeCommand(new TurnRightCommand());
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

        System.out.println(rover.reportStatus());
        scanner.close();
    }
}
