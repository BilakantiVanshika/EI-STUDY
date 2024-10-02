public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position move(Direction direction) {
        switch (direction) {
            case NORTH:
                return new Position(x, y + 1);
            case EAST:
                return new Position(x + 1, y);
            case SOUTH:
                return new Position(x, y - 1);
            case WEST:
                return new Position(x - 1, y);
            default:
                return this;
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position other = (Position) obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return x * 31 + y;
    }
}
