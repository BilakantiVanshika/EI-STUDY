public class TurnRightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.setDirection(rover.getDirection().turnRight());
    }
}
