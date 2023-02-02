package command;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandParserTest {
    private Map<String, Command> nameToCommand = Map.of(
            "F", new ForwardCommand(),
            "B", new BackwardsCommand(),
            "L", new RotateLeftCommand(),
            "R", new RotateRightCommand());

    @Test
    public void shouldParseCommands() {
        // given
        CommandParser parser = new CommandParser(nameToCommand);

        // when
        List<Command> parsedCommands = parser.parseCommands("FFBLLR");

        // then
        assertEquals(6, parsedCommands.size());
        assertTrue(parsedCommands.get(0) instanceof ForwardCommand);
        assertTrue(parsedCommands.get(1) instanceof ForwardCommand);
        assertTrue(parsedCommands.get(2) instanceof BackwardsCommand);
        assertTrue(parsedCommands.get(3) instanceof RotateLeftCommand);
        assertTrue(parsedCommands.get(4) instanceof RotateLeftCommand);
        assertTrue(parsedCommands.get(5) instanceof RotateRightCommand);
    }
}
