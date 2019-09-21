package com.company;

public class Head extends Brain {

    public Head() {
    }

    public Head(int smartLevel, double iq) {
        super(smartLevel, iq);
    }

    public Head(int smartLevel) {
        super(smartLevel);
    }

    public Head(double iq) {
        super(iq);
    }

    @Override
    public int intelligenceLevel() {
        return 0;
    }

    @Override
    public double adaptiveLevel() {
        return 0;
    }
}
