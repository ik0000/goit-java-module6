package com.goit.module6;


public class Door {
    private String doorName;
    private boolean doorState;
    private boolean leftFrontOpened;
    private boolean rightFrontOpened;
    private boolean leftBackOpened;
    private boolean rightBacktOpened;

    public Door(String doorName, boolean doorState) {
        this.doorName = doorName;
        this.doorState = doorState;
    }

    public String getDoorName() {
        return doorName;
    }
    public boolean getDoorState() {
        return doorState;
    }
    public String getDoor() {
        return doorName;
    }

    public void setDoor(String door) {
        this.doorName = doorName;
    }
    public void openDoor(String doorName){
        if (doorName == "Front Left") {leftFrontOpened = true;}
        else if (doorName == "Front Right") {rightFrontOpened = true;}
        else if (doorName == "Back Left") {leftBackOpened = true;}
        else if (doorName == "Front Left") {rightBacktOpened = true;}
    }
    public void closeDoor(String doorName){
        if (doorName == "Front Left") {leftFrontOpened = false;}
        else if (doorName == "Front Right") {rightFrontOpened = false;}
        else if (doorName == "Back Left") {leftBackOpened = false;}
        else if (doorName == "Front Left") {rightBacktOpened = false;}
    }
}
