package rover;

import command.*;
import org.junit.jupiter.api.Test;
import position.Direction;
import position.Position;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    private Map<String, Command> nameToCommand = Map.of(
            "F", new ForwardCommand(),
            "B", new BackwardsCommand(),
            "L", new RotateLeftCommand(),
            "R", new RotateRightCommand());


    @Test
    public void roverShouldExecuteCorrectCommands() {
        Position beginPosition = new Position(4, 2, Direction.EAST);
        Rover rover = new Rover(beginPosition, new CommandParser(nameToCommand));

        Position newPosition = rover.execute("FLFFFRFLB");
        assertEquals(6, newPosition.getX());
        assertEquals(4, newPosition.getY());
        assertEquals(Direction.NORTH, newPosition.getDirection());
    }
}
