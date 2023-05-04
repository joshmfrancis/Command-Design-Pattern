/**
 * File: GarageDoor.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description:  This helper class handles everything when it comes
 * to the state of a garage door, it is updated by the "Command" classes (on/off)
 */

// Package
package CommandPattern;

/**
 * GarageDoor class - handles the state of the garage door and messages for the
 * user to read
 * @author josh
 */
public class GarageDoor
{
    Boolean up; // Holds the garage door's state

    /**
     * doorUp method - when called, raises the garage door and prints a message
     * for the user to read
     */
    public void doorUp()
    {
        up = true;
        System.out.println("The garage door is up");
    }

    /**
     * doorUp method - when called, lowers the garage door and prints a message
     * for the user to read
     */
    public void doorDown()
    {
        up = false;
        System.out.println("The garage door is down");
    }

}
