/**
 * File: LightOnCommand.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: This helper class handles the lights on command,
 * along with an undo command which does the opposite of turning the light on.
 */

// Package
package CommandPattern;

/**
 * LightOnCommand class - implements the Command Interface, It is used 
 * for the command of turning on the light
 * @author josh
 */
public class LightOnCommand implements Command 
{
    //Instantiates the light class for use in this class
    Light light;

    /**
     * Constructor - sets local light (passed in) and sets it to the global
     * variable for use in this class
     * @param light
     */
    public LightOnCommand(Light light) 
    {
        this.light = light;
    }

    /**
     * execute method - tells the light object to set the light status to on
     */
    public void execute() 
    {
        light.switchOn();
    }

    /**
     * undo method - Undo command for the light, calls the switchOff method of
     * the light object
     */
    public void undo() 
    {
        light.switchOff();
    }

}
