package command;

import position.Direction;
import position.Position;

public class BackwardsCommand implements Command{
    @Override
    public Position execute(Position position) {
        int x = position.getX();
        int y = position.getY();

        if (Direction.NORTH.equals(position.getDirection())) {
            return new Position(x , y - 1, position.getDirection());
        } else if (Direction.EAST.equals(position.getDirection())) {
            return new Position(x - 1, y, position.getDirection());
        } else if (Direction.SOUTH.equals(position.getDirection())) {
            return new Position(x, y + 1, position.getDirection());
        } else if (Direction.WEST.equals(position.getDirection())) {
            return new Position(x + 1, y, position.getDirection());
        }

        throw new IllegalArgumentException("No such direction");
    }
}
