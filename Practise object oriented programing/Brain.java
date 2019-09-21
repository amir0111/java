package com.company;

public abstract class Brain {

    private int smartLevel;
    private double iq;

    public Brain(){}
    public Brain(int smartLevel, double iq) {
        this.smartLevel = smartLevel;
        this.iq = iq;
    }
    public Brain(int smartLevel) {
        this.smartLevel = smartLevel;
    }
    public Brain(double iq) {
        this.iq = iq;
    }

    public int getSmartLevel() {
        return smartLevel;
    }

    public void setSmartLevel(int smartLevel) {
        this.smartLevel = smartLevel;
    }

    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    public abstract int intelligenceLevel();

    public abstract double adaptiveLevel();
    //protected abstract int something();
    //private abstract int something1(); //cannot
}
