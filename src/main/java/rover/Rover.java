package rover;

import command.Command;
import command.CommandParser;
import position.Position;

import java.util.List;

public class Rover {
    private Position position;
    private final CommandParser commandParser;

    public Rover(Position position, CommandParser commandParser) {
        this.position = position;
        this.commandParser = commandParser;
    }

    public Position execute(String commands) {
        List<Command> parsedCommands = commandParser.parseCommands(commands);
        for (Command command: parsedCommands) {
            position = command.execute(position);
        }

        return position;
    }
}
