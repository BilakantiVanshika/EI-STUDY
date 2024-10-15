public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        Position newPosition = rover.getPosition().move(rover.getDirection());

        if (rover.getGrid().isObstacle(newPosition)) {
            System.out.println("Obstacle detected at position: " + newPosition);
        } else if (rover.getGrid().isWithinBounds(newPosition)) {
            rover.setPosition(newPosition);
        } else {
            System.out.println("Rover out of bounds!");
        }
    }
}
