/**
 * File: AutoHome.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: This class is the main class of the program. It
 * creates a remote control object and commands that are used to do actions to
 * manipulate the state of the kitchen lights, bedroom lights, and garage door.
 */

// Package
package CommandPattern;

/**
 * Main class - Creates a remote control and tests the controls through commands
 * created
 * @author thejo
 */
public class AutoHome
{

    /**
     * Main method - Holds the commands passed to the remote control
     * @param args
     */
    public static void main(String[] args)
    {
        // Creates a remote control object that initiates an arraylist that
        // holds the commands and starts the history of the commands
        RemoteControl control = new RemoteControl(6);

        // Creates a new light for the kitchen along with a command for prompting it
        Light klight = new Light("Kitchen");
        Command klightsOn = new LightOnCommand(klight);

        // Creates a new light for the bedroom along with a command for prompting it
        Light blight = new Light("Bedroom");
        Command blightsOff = new LightOffCommand(blight);

        // Creates a new door for the garage along with a command for prompting it
        GarageDoor gdoor = new GarageDoor();
        Command garageUp = new GarageUpCommand(gdoor);

        // Spacing and information for the reader to see - Start of Commands
        System.out.println("\nCommands:\n");

        // sets and executes, kitchen light on is button #1 in the array of commands
        control.setCommand(0, klightsOn);
        control.pressButton(0);

        // sets and executes, bedroom light off is button #2 in the array of commands
        control.setCommand(1, blightsOff);
        control.pressButton(1);

        // sets and executes, garage door up is button #3 in the array of commands
        control.setCommand(2, garageUp);
        control.pressButton(2);

        // Spacing and information for the reader to see - Undo of Commands
        System.out.println("\nUndo Commands:\n");

        // Undoes the command based on the last command used
        // Check undo method for more context
        control.undo();
        control.undo();
        control.undo();
        control.undo(); // Tests the loop in the functionality of the undo method

    }

}