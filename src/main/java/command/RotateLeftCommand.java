package command;

import position.Direction;
import position.Position;

public class RotateLeftCommand implements Command{
    @Override
    public Position execute(Position position) {
        int x = position.getX();
        int y = position.getY();

        if (Direction.NORTH.equals(position.getDirection())) {
            return new Position(x , y,Direction.WEST);
        } else if (Direction.EAST.equals(position.getDirection())) {
            return new Position(x, y, Direction.NORTH);
        } else if (Direction.SOUTH.equals(position.getDirection())) {
            return new Position(x, y, Direction.EAST);
        } else if (Direction.WEST.equals(position.getDirection())) {
            return new Position(x, y, Direction.SOUTH);
        }

        throw new IllegalArgumentException("No such direction");
    }
}
