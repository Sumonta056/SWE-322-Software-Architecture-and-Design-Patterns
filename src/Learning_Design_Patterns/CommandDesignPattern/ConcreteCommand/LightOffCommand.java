package Learning_Design_Patterns.CommandDesignPattern.ConcreteCommand;

import Learning_Design_Patterns.CommandDesignPattern.Command.Command;
import Learning_Design_Patterns.CommandDesignPattern.Receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
