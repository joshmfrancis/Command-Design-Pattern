/**
 * File: GarageDoorUp.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: This helper class handles the garage opening command,
 * along with an undo command which does the opposite of opening it.
 */

// Package
package CommandPattern;

/**
 * GarageUpCommand class - implements the Command Interface, It is used 
 * for the command of opening the garage
 * @author josh
 */
public class GarageUpCommand implements Command 
{
    //Instantiates the garageDoor class for use in this class
    GarageDoor garageDoor;

    /**
     * Constructor - sets local garageDoor (passed in) and sets it to the global
     * variable for use in this class
     * @param garageDoor
     */
    public GarageUpCommand(GarageDoor garageDoor) 
    {
        this.garageDoor = garageDoor;
    }

    /**
     * execute method - tells the garageDoor object to set the garage door to 
     * up
     */
    public void execute() 
    {
        garageDoor.doorUp();
    }

    /**
     * undo method - Undo command for the garage door, calls the DoorDown method
     * of the garageDoor object
     */
    public void undo() 
    {
        garageDoor.doorDown();
    }

}
