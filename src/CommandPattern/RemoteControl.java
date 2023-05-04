/**
 * File: RemoteControl.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: This helper class handles calls made by the main
 * method through use of it's methods: setCommand, pressButton, and undo.
 */

// Package
package CommandPattern;

// Import I used
import java.util.ArrayList;

/**
 * Class that handles all of the commands passed in through the main methods
 * @author josh
 */
public class RemoteControl
{
    private Command[] commands; // Commands array to hold the commands available to be used
    private ArrayList<Command> history; // Histoty array to hold all of the actions asked to do by the remote control

    /**
     * Constructor - instantiates the two arrays created above, and passes in
     * the amount of buttons for this use
     * @param buttonCount
     */
    public RemoteControl(int buttonCount)
    {
        commands = new Command[buttonCount];
        history = new ArrayList<>();
    }

    /**
     * setCommand method - sets the class variable from the local variable
     * passed in, used for setting the command that is going to be executed
     * @param button
     * @param command
     */
    public void setCommand(int button, Command command)
    {
        this.commands[button] = command;
    }

    /**
     * pressButton method - initiates the action of the command called, adds the
     * command executed to the history array for use in the undo method
     * @param button
     */
    public void pressButton(int button)
    {
        commands[button].execute();
        history.add(commands[button]);
    }

    /**
     * Undo method - undoes the action of the last command when called
     */
    public void undo()
    {
        // If loop to handle if a previous command does not exist when this
        // method is called
        if (!history.isEmpty())
        {
            // call the undo method in the Command
            // class for an item in the Command array
            commands[(history.size() - 1)].undo();
            // Deletes the last command off of the history array
            history.remove(history.size() - 1);
        }
        else
        {
            // Alerts the user that the undo command doesn't work when there is
            // no previous command to undo
            System.out.println("No previous command!");
        }

    }

}
