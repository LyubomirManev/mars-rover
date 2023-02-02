package command;

import org.junit.jupiter.api.Test;
import position.Direction;
import position.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackwardsCommandTest {
    @Test
    public void shouldGoBackwardsWhenFacingNorth() {
        // given
        BackwardsCommand backwardsCommand = new BackwardsCommand();
        Position beginningPosition = new Position(1, 2, Direction.NORTH);

        // when
        Position newPosition = backwardsCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY() - 1, newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

    @Test
    public void shouldGoBackwardsWhenFacingEast() {
        // given
        BackwardsCommand backwardsCommand = new BackwardsCommand();
        Position beginningPosition = new Position(1, 2, Direction.EAST);

        // when
        Position newPosition = backwardsCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX() - 1, newPosition.getX());
    }

    @Test
    public void shouldGoBackwardsWhenFacingSouth() {
        // given
        BackwardsCommand backwardsCommand = new BackwardsCommand();
        Position beginningPosition = new Position(1, 2, Direction.SOUTH);

        // when
        Position newPosition = backwardsCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY() + 1, newPosition.getY());
        assertEquals(beginningPosition.getX(), newPosition.getX());
    }

    @Test
    public void shouldGoBackwardsWhenFacingWest() {
        // given
        BackwardsCommand backwardsCommand = new BackwardsCommand();
        Position beginningPosition = new Position(1, 2, Direction.WEST);

        // when
        Position newPosition = backwardsCommand.execute(beginningPosition);

        // then
        assertEquals(beginningPosition.getDirection(), newPosition.getDirection());
        assertEquals(beginningPosition.getY(), newPosition.getY());
        assertEquals(beginningPosition.getX() + 1, newPosition.getX());
    }
}
