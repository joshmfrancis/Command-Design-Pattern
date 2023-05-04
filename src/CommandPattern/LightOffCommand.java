/**
 * File: LightOffCommand.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: This helper class handles the lights off command,
 * along with an undo command which does the opposite of turning the light off.
 */

// Package
package CommandPattern;

/**
 * LightOnCommand class - implements the Command Interface, It is used 
 * for the command of turning off the light
 * @author josh
 */
public class LightOffCommand implements Command 
{
    //Instantiates the light class for use in this class
    Light light;

    /**
     * Constructor - sets local light (passed in) and sets it to the global
     * variable for use in this class
     * @param light
     */
    public LightOffCommand(Light light) 
    {
        this.light = light;
    }

    /**
     * execute method - tells the light object to set the light status to off
     */
    public void execute() 
    {
        light.switchOff();
    }

    /**
     * undo method - Undo command for the light, calls the switchOn method of
     * the light object
     */
    public void undo() 
    {
        light.switchOn();
    }

}
