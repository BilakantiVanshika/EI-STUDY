public interface GridComponent {
    boolean isObstacle(Position position);
    boolean isWithinBounds(Position position);
}
