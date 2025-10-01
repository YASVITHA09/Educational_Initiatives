package invoker;

import commands.Command;
import java.util.ArrayList;
import java.util.List;

public class SatelliteController {
    private List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands() {
        for (Command command : commandQueue) {
            try {
                command.execute();
            } catch (Exception e) {
                System.err.println("Error executing command: " + e.getMessage());
            }
        }
        commandQueue.clear();
    }
}
