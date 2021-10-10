package behavioral.command.after;

import java.util.List;

public class SmartHouseController {
    private List<Command> command;

    public void setCommand(List<Command> command) {
        this.command = command;
    }

    public void perform(){
        command.forEach(Command::execute);
    }

    public void undo(){
        command.forEach(Command::undo);
    }
}
