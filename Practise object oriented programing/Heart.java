package com.company;

public abstract class Heart {

    public int pumping;
    public boolean isHealthy;
    /*
        2 instance variables
            distinct data types
        2 methods that are not getters or setters
        2 constructors
     */
    public Heart(){}

    public Heart(int pumping, boolean isHealthy) {
        this.pumping = pumping;
        this.isHealthy = isHealthy;
    }
    public boolean isHeartHealth(){

        return pumping <50;
    }
    public boolean canExercise(){

        return isHealthy && pumping < 100;
    }

    public abstract int energyLevel(String day);
}
