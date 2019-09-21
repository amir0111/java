package com.company;

public class Liver {

    private int valves;
    private double volume;

    public Liver(int valves, double volume) {
        this.valves = valves;
        this.volume = volume;
    }

    public Liver(double volume) {
        this.volume = volume;
    }

    public Liver(int valves) {
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
//        return this == o;


     try{
         Liver compare = (Liver) o;

         //return this.toString() == o.toString();
        // return this.toString().equals( o.toString());

        return this.volume == compare.volume
                && valves == compare.valves;
    }
     catch (Exception e){
         return false;
     }
    }

    @Override
    public String toString() {
        return "Liver{" +
                "valves=" + valves +
                ", volume=" + volume +
                '}';
    }
}
