package command;

import java.util.*;

public class CommandParser {
    private final Map<String, Command> nameToCommand;

    public CommandParser(Map<String, Command> nameToCommand) {
        this.nameToCommand = nameToCommand;
    }

    public List<Command> parseCommands(String commands) {
        if (commands == null) {
            return Collections.emptyList();
        }
        List<Command> result = new ArrayList<>();

        for (char command: commands.toCharArray()) {
            Command parsedCommand = nameToCommand.get(String.valueOf(command));
            if (parsedCommand != null) {
                result.add(parsedCommand);
            }
        }

        return result;
    }
}
