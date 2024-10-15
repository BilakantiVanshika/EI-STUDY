import java.util.ArrayList;
import java.util.List;

public class Grid implements GridComponent {
    private int width;
    private int height;
    private List<GridComponent> components;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.components = new ArrayList<>();
    }

    public void addComponent(GridComponent component) {
        components.add(component);
    }

    @Override
    public boolean isObstacle(Position position) {
        for (GridComponent component : components) {
            if (component.isObstacle(position)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() < width &&
               position.getY() >= 0 && position.getY() < height;
    }
}
