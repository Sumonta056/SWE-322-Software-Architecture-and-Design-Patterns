package Learning_Design_Patterns.CommandDesignPattern;

import Learning_Design_Patterns.CommandDesignPattern.Command.Command;
import Learning_Design_Patterns.CommandDesignPattern.ConcreteCommand.LightOffCommand;
import Learning_Design_Patterns.CommandDesignPattern.ConcreteCommand.LightOnCommand;
import Learning_Design_Patterns.CommandDesignPattern.Invoker.RemoteControl;
import Learning_Design_Patterns.CommandDesignPattern.Receiver.Light;

public class Client {
    public static void main(String[] args) {
        // Create the receiver objects
        Light livingRoomLight = new Light();

        // Create the concrete command objects and associate them with receivers
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Create the invoker (remote control)
        RemoteControl remoteControl = new RemoteControl();

        // Associate commands with the remote control buttons
        remoteControl.setCommand(lightOnCommand); // Light On button
        remoteControl.pressButton();
        // Executes LightOnCommand's execute() method

        remoteControl.setCommand(lightOffCommand); // Light Off button
        remoteControl.pressButton();
        // Executes LightOffCommand's execute() method
    }
}
