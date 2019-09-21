package com.company;

public interface Arm {

    byte MAX_ARMS = 2;
    byte MIN_LENGTH = 10;
    byte MAX_LENGTH = 100;


    boolean isTired(String day);
    public int strengthLevel(int age);
    //private boolean something();
    //protected boolean something();
}
