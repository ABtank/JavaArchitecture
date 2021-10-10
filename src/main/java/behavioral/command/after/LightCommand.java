package behavioral.command.after;

import behavioral.command.Light;

public class LightCommand implements Command {
    private Light light = new Light();

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
