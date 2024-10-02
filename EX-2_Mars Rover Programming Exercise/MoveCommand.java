public class MoveCommand implements Command {
    @Override
    public void execute(Rover rover) {
        Position newPosition = rover.getPosition().move(rover.getDirection());
        rover.setPosition(newPosition);
    }
}
