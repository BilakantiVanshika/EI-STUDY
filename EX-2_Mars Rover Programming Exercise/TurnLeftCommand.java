public class TurnLeftCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.setDirection(rover.getDirection().turnLeft());
    }
}
