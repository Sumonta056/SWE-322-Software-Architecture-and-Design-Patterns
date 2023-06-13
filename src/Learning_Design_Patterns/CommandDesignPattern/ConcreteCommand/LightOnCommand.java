package Learning_Design_Patterns.CommandDesignPattern.ConcreteCommand;

import Learning_Design_Patterns.CommandDesignPattern.Command.Command;
import Learning_Design_Patterns.CommandDesignPattern.Receiver.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

