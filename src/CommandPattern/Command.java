/**
 * File: Command.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 03/28/2023
 * Java class description: Interface that is used in the helper classes:
 * Garage(Up/Down)Command, Light(On/Off)Command, and partially in the
 * RemoteControl Class. It's main use is for continuity between the classes.
 */

// Package
package CommandPattern;

/**
 * Command Interface - for use in the doors and lights to create continuity in 
 * the classes
 * @author josh
 */
public interface Command
{
    // Methods used in the garage door, lights, and remote control (partially)
    abstract public void execute();
    abstract public void undo();
}
