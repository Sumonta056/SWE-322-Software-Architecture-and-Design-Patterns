package Learning_Design_Patterns.CommandDesignPattern.Invoker;

import Learning_Design_Patterns.CommandDesignPattern.Command.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
