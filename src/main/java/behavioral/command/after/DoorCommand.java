package behavioral.command.after;

import behavioral.command.Door;

public class DoorCommand implements Command {
    private Door door = new Door();

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
