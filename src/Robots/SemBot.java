package Robots;
import becker.robots.*;

public class SemBot extends Robot {

    public SemBot(City city, int x, int y, Direction direction) {
        super(city, x, y, direction);
    }

    public boolean isFacingEast() {

        if (getDirection() == Direction.EAST) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFacingWest() {

        if (getDirection() == Direction.WEST) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFacingNorth() {

        if (getDirection() == Direction.NORTH) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFacingSouth() {

        if (getDirection() == Direction.SOUTH) {
            return true;
        } else {
            return false;
        }

    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void faceEast() {
        if (isFacingNorth()) {
            turnRight();
        }
        if (isFacingSouth()) {
            turnLeft();
        }
        if (isFacingWest()) {
            turnLeft();
            turnLeft();
        }
    }

    public void faceWest() {
        if (isFacingNorth()) {
            turnLeft();
        }
        if (isFacingSouth()) {
            turnRight();
        }
        if (isFacingEast()) {
            turnLeft();
            turnLeft();
        }
    }

    public void faceNorth() {
        if (isFacingEast()) {
            turnLeft();
        }
        if (isFacingWest()) {
            turnRight();
        }
        if (isFacingSouth()) {
            turnLeft();
            turnLeft();
        }
    }

    public void faceSouth() {
        if (isFacingEast()) {
            turnRight();
        }
        if (isFacingWest()) {
            turnLeft();
        }
        if (isFacingNorth()) {
            turnLeft();
            turnLeft();
        }
    }

    public void move(int m) {
        for (int i = 0; i < m; i++) {
            move();
        }
    }

    public void turnAround() {
        turnLeft();
        turnLeft();
    }

    public void pickAllThings() {
        while (canPickThing()) pickThing();
    }

    public void putAllThings() {
        for (int i = 0; i < countThingsInBackpack(); i++) {
            putThing();
        }
    }

}