package command;

import org.junit.jupiter.api.Test;
import position.Direction;
import position.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateLeftCommandTest {

    @Test
    public void shouldRotateLeftWhenFacingNorth() {
        // given
        RotateLeftCommand rotateLeftCommand = new RotateLeftCommand();
        Position beginningPosition = new Position(1, 2, Direction.NORTH);

        // when
        Position newPosition = rotateLeftCommand.execute(beginningPosition);

        // then
        assertEquals(Direction.WEST, newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

    @Test
    public void shouldRotateLeftWhenFacingEast() {
        // given
        RotateLeftCommand rotateLeftCommand = new RotateLeftCommand();
        Position beginningPosition = new Position(1, 2, Direction.EAST);

        // when
        Position newPosition = rotateLeftCommand.execute(beginningPosition);

        // then
        assertEquals(Direction.NORTH, newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

    @Test
    public void shouldRotateLeftWhenFacingSouth() {
        // given
        RotateLeftCommand rotateLeftCommand = new RotateLeftCommand();
        Position beginningPosition = new Position(1, 2, Direction.SOUTH);

        // when
        Position newPosition = rotateLeftCommand.execute(beginningPosition);

        // then
        assertEquals(Direction.EAST, newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

    @Test
    public void shouldRotateLeftWhenFacingWest() {
        // given
        RotateLeftCommand rotateLeftCommand = new RotateLeftCommand();
        Position beginningPosition = new Position(1, 2, Direction.WEST);

        // when
        Position newPosition = rotateLeftCommand.execute(beginningPosition);

        // then
        assertEquals(Direction.SOUTH, newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

}
