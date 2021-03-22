package com.bnp.power.test;

public class Direction {

    public String label;
    public int x;
    public int y;
    private double value;


    Direction() {
        this.label = "N";
        initValue(label);
    }

    Direction(String label) {
        this.label = label;
        initValue(label);
    }

    public void spinLeft() {
        this.value = this.value + Math.PI / 2;
        convertRoutine();
    }

    public void spinRight() {
        this.value = this.value - Math.PI / 2;
        convertRoutine();
    }

    private void initValue(String label) {
        switch (label) {
            case "N":
                value = Math.PI / 2;
                break;
            case "E":
                value = 0;
                break;
            case "S":
                value = 3 * Math.PI / 2;
                break;
            case "W":
                value = Math.PI;
                break;
        }
        convertRoutine();
    }

    private void switchLabel() {
        if (y == 1) {
            this.label = "N";
        } else if (x == 1) {
            this.label = "E";
        } else if (y == -1) {
            this.label = "S";
        } else if (x == -1) {
            this.label = "W";
        }
    }

    private void computeX() {
        this.x = (int) Math.cos(value);
    }

    private void computeY() {
        this.y = (int) Math.sin(value);
    }

    private void convertRoutine() {
        this.computeX();
        this.computeY();
        this.switchLabel();
    }

}