package com.company;

import java.util.EnumSet;

public class Human extends Heart{

    private byte age = 18;
    enum GenderPossibilities { MALE, FEMALE, UNDECLARED};
    //protected char gender;
    private GenderPossibilities gender = GenderPossibilities.UNDECLARED;
    public String name = "";
    public String occupation ="";
    public float height = 1.5F;
    private double weight = 60d;
    public int humourLevel;
    private short sensibilityLevel;
    protected long angerLevel;
//    private final Liver humanLiver = new Liver(4);
    public static Liver CONSTANT_LIVER = new Liver(10, 200);
    private final Liver humanLiver;


    /*
    CHARACTERISTICS
        age
        gender
        name
        height
        weight
        occupation

        humourLevel
        angerLevel
        sensibilityLevel

    STATES
        isWorking
        isFunny
        athleticLevel
        mood
     */
    public Human(String name, String gender,
                 int valves, double volume){

        this.name = name;
        this.setGender(gender);
        this.humanLiver = new Liver(valves, volume);


    }
    public Human(){
        humanLiver = new Liver(1, 100);
    }
    public Human(String name){
        this.name = name;
        humanLiver = new Liver(11, 110);
    }

    public Human(String name,byte age) {
        this.age = age;
        this.name = name;
        humanLiver = new Liver(2, 200);
    }

    public Human(byte age){
        this.age = age;
        humanLiver = new Liver(22, 220);
    }

    public Human(float height, double weight) {
        this.height = height;
        this.weight = weight;
        humanLiver = new Liver(3, 300);
    }

    public Human(float height, double weight, int humourLevel) {
        this.height = height;
        this.weight = weight;
        this.humourLevel = humourLevel;
        humanLiver = new Liver(33, 330);
    }

    public String getGender() {
        return gender == null ? "null" : gender.toString();
    }

    public void setGender(GenderPossibilities gender) {
        this.gender = gender;
    }
    /*
    public void setGender(String gender) {
 //       this.gender = gender;
        switch (gender.toLowerCase().trim()){

            case "female":
                this.gender = GenderPossibilities.FEMALE;
                break;
            case "male":
                this.gender = GenderPossibilities.MALE;
                break;
            default:
                this.gender = GenderPossibilities.UNDECLARED;

        }
    }
*/
    public void setGender(String gender) {

        this.gender = GenderPossibilities.UNDECLARED;

        for(GenderPossibilities current :
                EnumSet.range(GenderPossibilities.MALE,
                        GenderPossibilities.UNDECLARED)){

            if(current.toString().toLowerCase().equals(gender.toLowerCase())){
                this.gender = current;
                break;
            }
        }
       }
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age < 1 )
            throw new IllegalArgumentException(
                    String.format("The age of " +
                            "%d is invalid! " +
                            "Please enter an age" +
                            "between 1 and 127",
                            age)
            );
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public short getSensibilityLevel() {
        return sensibilityLevel;
    }

    public void setSensibilityLevel(short sensibilityLevel) {
        this.sensibilityLevel = sensibilityLevel;
    }

    public boolean isWorking(){
        return age >= 13 && occupation != null;
    }
    public int athleticLevel(){

        if(age > 18 && height >= 1.5
                && weight > 50 ){
            return 10;
        }
        else if (age > 50)
            return -10;


        return 1;
    }

    public boolean isFunny(){

//        return humourLevel >=7 ? true : false;
        return humourLevel >=7;
    }
    public String mood(){
        if(angerLevel > 10)
            return "Angry";
        else if(humourLevel < 2)
            return "Sad";
        else if(humourLevel > 8)
            return "Funny";
        else if (sensibilityLevel > 5)
            return "Volitail";

        return "Neutral";
    }

    @Override
    public String toString() {
        return "The Human is " +
                "" + age +
                " years old, has the gender=" + gender +
                ", is named '" + name + '\'' +
                " has the occupation of '" + occupation + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", humourLevel=" + humourLevel +
                ", sensibilityLevel=" + sensibilityLevel +
                ", angerLevel=" + angerLevel +
                '}';
    }

    @Override
    public boolean equals(Object ob){

        /*
            try to typecast the object to a Human
            if successful
                compare all instance variables of Human
                    return true of false value
                    if all instance vars have same value
            if not successful
                return false

         */
        try{
            Human compare = (Human)ob;
            return age == compare.age
                    && height == compare.height
                    && weight == compare.weight
                    && humourLevel == compare.humourLevel
                    && sensibilityLevel == compare.sensibilityLevel
                    && angerLevel == compare.angerLevel
                    && gender.equals(compare.gender)
                    && name.equals(compare.name)
                    && occupation.equals(compare.occupation)
                    && humanLiver.equals(compare.humanLiver)

                    ;
        }
        catch(Exception e){

            return false;
        }

    }

    @Override
    public int energyLevel(String day) {
        switch (day.toLowerCase()){

            case "morning":
                return 25;
            case "afternoon":
                return 50;
            case "evening":
                return 75;
            default:
                return 10;

        }
    }

    public Human(int pumping, boolean isHealthy,
                 byte age, String name, float height, double weight) {
        super(pumping, isHealthy);
        this.humanLiver = new Liver(12, 10);
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
