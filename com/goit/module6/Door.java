package com.goit.module6;


public class Door {
    private String doorName;
    private boolean doorClosed;
    private boolean leftFrontOpened;
    private boolean rightFrontOpened;
    private boolean leftBackOpened;
    private boolean rightBacktOpened;

    public Door(String doorName, boolean doorClosed) {
        this.doorName = doorName;
        this.doorClosed = doorClosed;
    }

    public String getDoorName() {
        return doorName;
    }

    public boolean isDoorClosed() {
        return doorClosed;
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
