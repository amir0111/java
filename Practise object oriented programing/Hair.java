package com.company;

public interface Hair {

    double MAX_STRANDS = 100;

    byte STYLE_BALD = 0;
    byte STYLE_STRAIGHT = 1;
    byte STYLE_CURLY = 2;

    String getStyle();
    public double growingSpeed();

}
