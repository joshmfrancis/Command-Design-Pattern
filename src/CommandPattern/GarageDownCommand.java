/**
 * File: GarageDoorDown.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: This helper class handles the garage closing command,
 * along with an undo command which does the opposite of closing it.
 */

// Package
package CommandPattern;

/**
 * GarageDownCommand class - implements the Command Interface, It is used 
 * for the command of closing the garage
 * @author josh
 */
public class GarageDownCommand implements Command
{
    //Instantiates the garageDoor class for use in this class
    GarageDoor garageDoor;

    /**
     * Constructor - sets local garageDoor (passed in) and sets it to the global
     * variable for use in this class
     * @param garageDoor
     */
    public GarageDownCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    /**
     * execute method - tells the garageDoor object to set the garage door to
     * down
     */
    public void execute()
    {
        garageDoor.doorDown();
    }

    /**
     * undo method - Undo command for the garage door, calls the DoorUp method
     * of the garageDoor object
     */
    public void undo()
    {
        garageDoor.doorUp();
    }

}