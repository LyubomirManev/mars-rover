package command;

import position.Position;

public interface Command {
    Position execute(Position position);
}
