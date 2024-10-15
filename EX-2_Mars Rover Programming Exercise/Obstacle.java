public class Obstacle implements GridComponent {
    private Position position;

    public Obstacle(Position position) {
        this.position = position;
    }

    @Override
    public boolean isObstacle(Position pos) {
        return this.position.equals(pos);
    }

    @Override
    public boolean isWithinBounds(Position pos) {
        return true; // Obstacles do not check bounds
    }

    @Override
    public String toString() {
        return "Obstacle at " + position;
    }
}
