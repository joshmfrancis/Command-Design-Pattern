/**
 * File: Light.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: This helper class handles everything when it comes
 * to the state of a light, it is updated by the "Command" classes (on/off)
 */

// Package
package CommandPattern;

/**
 * Light class - handles the state of the light and messages for the user to
 * read
 * @author josh
 */
public class Light
{
    private boolean on; // Holds the light's state
    private String name; // Holds the light's name

    /**
     * Constructor - passes in a name for the light for use in the other methods
     * @param name
     */
    public Light(String name)
    {
        this.name = name;
    }

    /**
     * switchOn method - when called, turns on the light and prints a message
     * for the user to read
     */
    public void switchOn()
    {
        on = true;
        System.out.println(this.name + " Lights have been turned on");
    }

    /**
     * switchOff method - when called, turns off the light and prints a message
     * for the user to read
     */
    public void switchOff()
    {
        on = false;
        System.out.println(this.name + " Lights have been turned off");
    }

}
