package com.company;

public class Mutant extends Human implements Arm, Hair {

    /*
        Add 3 more instance variables to Mutant
            distinct data types
     */

    String skill;
    private boolean isHealthy;
    public int speed;

    public Mutant(){}

    public Mutant(String name) {
        super(name);
    }

    public Mutant(String name, byte age) {
        super(name, age);
    }

    public Mutant(String name, boolean isHealthy) {
        super(name);
        this.isHealthy = isHealthy;
    }

    public Mutant(String name, byte age, boolean isHealthy) {
        super(name, age);
        this.isHealthy = isHealthy;
    }

    @Override
    public String toString() {
        return "Mutant{" +
                "skill='" + skill + '\'' +
                ", isHealthy=" + isHealthy +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", height=" + height +
                ", humourLevel=" + humourLevel +
                ", angerLevel=" + angerLevel +
                '}';

    }

    @Override
    public byte getAge(){
//        byte muliplier = 7;
        return (byte)(super.getAge() * 7);
    }

    @Override
    public boolean isTired(String day) {
        return false;
    }

    @Override
    public int strengthLevel(int age) {
        return 0;
    }

    @Override
    public String getStyle() {
        return String.valueOf(STYLE_BALD);
    }

    @Override
    public double growingSpeed() {
        return 0;
    }
}
