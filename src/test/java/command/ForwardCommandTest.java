package command;

import org.junit.jupiter.api.Test;
import position.Direction;
import position.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForwardCommandTest {

    @Test
    public void shouldGoForwardWhenFacingNorth() {
        // given
        ForwardCommand forwardCommand = new ForwardCommand();
        Position beginningPosition = new Position(1, 2, Direction.NORTH);

        // when
        Position newPosition = forwardCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY() + 1, newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

    @Test
    public void shouldGoForwardWhenFacingEast() {
        // given
        ForwardCommand forwardCommand = new ForwardCommand();
        Position beginningPosition = new Position(1, 2, Direction.EAST);

        // when
        Position newPosition = forwardCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX() + 1, newPosition.getX());
    }

    @Test
    public void shouldGoForwardWhenFacingSouth() {
        // given
        ForwardCommand forwardCommand = new ForwardCommand();
        Position beginningPosition = new Position(1, 2, Direction.SOUTH);

        // when
        Position newPosition = forwardCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY() - 1, newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

    @Test
    public void shouldGoForwardWhenFacingWest() {
        // given
        ForwardCommand forwardCommand = new ForwardCommand();
        Position beginningPosition = new Position(1, 2, Direction.WEST);

        // when
        Position newPosition = forwardCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX() - 1, newPosition.getX());
    }
}
