package com.bnp.power.test;

public class PlateauTopology {

    final int width;
    final int height;

    public PlateauTopology(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean contains(int x, int y) {
        if (x < 0 || x >= width || y < 0 || x >= height) {
            return false;
        } else {
            return true;
        }
    }

}