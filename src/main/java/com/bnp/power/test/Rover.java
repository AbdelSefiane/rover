package com.bnp.power.test;

public class Rover {

    int x;
    int y;
    Direction direction;
    PlateauTopology plateauTopology;

    public Rover(String roverDesc) {
        String[] splitedDesc = roverDesc.split(" ");
        this.x = Integer.parseInt(splitedDesc[0]);
        this.y = Integer.parseInt(splitedDesc[1]);
        direction = new Direction(splitedDesc[2]);
    }

    public void move() {
        int tmpX = x, tmpY = y;
        tmpX = tmpX + direction.x;
        tmpY = tmpY + direction.y;
        if (plateauTopology.contains(tmpX, tmpY)) {
            x = tmpX;
            y = tmpY;
        }
    }

    public void spin(String instruction) {
        if ("L".equals(instruction)) {
            this.direction.spinLeft();
        } else if ("R".equals(instruction)) {
            this.direction.spinRight();
        }
    }

    public void setPlateauTopology(PlateauTopology plateauTopology) {
        this.plateauTopology = plateauTopology;
    }
}