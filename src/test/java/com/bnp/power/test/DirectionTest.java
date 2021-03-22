package com.bnp.power.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectionTest {

    private Direction direction;

    @Before
    public void given(){
        direction = new Direction();
    }

    @Test
    public void spin_left_should_go_counter_clockwise(){
        Assert.assertEquals(0, direction.x);
        Assert.assertEquals(1, direction.y);
        Assert.assertEquals("N", direction.label);
        direction.spinLeft();
        Assert.assertEquals(-1, direction.x);
        Assert.assertEquals(0, direction.y);
        Assert.assertEquals("W", direction.label);
        direction.spinLeft();
        Assert.assertEquals(0, direction.x);
        Assert.assertEquals(-1, direction.y);
        Assert.assertEquals("S", direction.label);
        direction.spinLeft();
        Assert.assertEquals(1, direction.x);
        Assert.assertEquals(0, direction.y);
        Assert.assertEquals("E", direction.label);
    }

    @Test
    public void spin_right_should_go_clockwise(){
        Assert.assertEquals(0, direction.x);
        Assert.assertEquals(1, direction.y);
        Assert.assertEquals("N", direction.label);
        direction.spinRight();
        Assert.assertEquals(1, direction.x);
        Assert.assertEquals(0, direction.y);
        Assert.assertEquals("E", direction.label);
        direction.spinRight();
        Assert.assertEquals(0, direction.x);
        Assert.assertEquals(-1, direction.y);
        Assert.assertEquals("S", direction.label);
        direction.spinRight();
        Assert.assertEquals(-1, direction.x);
        Assert.assertEquals(0, direction.y);
        Assert.assertEquals("W", direction.label);

    }
}