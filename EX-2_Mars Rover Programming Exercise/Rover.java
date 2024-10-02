public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.position = new Position(x, y);
        this.direction = direction;
        this.grid = grid;
    }

    public void executeCommand(Command command) {
        command.execute(this);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setPosition(Position position) {
        if (grid.isObstacle(position)) {
            System.out.println("Obstacle detected at position: " + position);
        } else if (grid.isWithinBounds(position)) {
            this.position = position;
        } else {
            System.out.println("Rover out of bounds!");
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String reportStatus() {
        return "Rover is at " + position + " facing " + direction + ".";
    }
}
