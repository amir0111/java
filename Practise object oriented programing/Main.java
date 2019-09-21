package com.company;
import java.sql.*;

public class Main {

    public static void Example1(){

        Human person = new Human();
        person.setGender(Human.GenderPossibilities.UNDECLARED);
        System.out.println(person.getGender());

        person.setGender("female");
        System.out.println(person.getGender());

        System.out.println(person);
        System.out.println(person.toString());


    }
    public static void Example2(){

        Human person = new Human();

        person.setAge((byte)100);
        System.out.println(person.getAge());
        //person.setAge((byte)130);
        person.setAge((byte)256);

        System.out.println(person.getAge());

    }
    public static void Example3(){

        Human person = new Human();
        try {

            person.setAge((byte) 100);
            System.out.println(person.getAge());
            //person.setAge((byte)130);
            person.setAge((byte) 256);

            System.out.println(person.getAge());
        }
        catch(IllegalArgumentException e){

            System.err.println(e);
        }

        System.out.println(person);

    }
    public static void Example4(){
        Human person1 = new Human("Java");
        Human person2 = new Human("Hola", (byte)30);

        System.out.println(person1);
        System.out.println(person2);
    }
    public static void Example5() {

        int x, y;
        x = 1;
        y = 1;

        Human person1 = new Human();
        Human person2 = person1;
        Human person3 = new Human();

        System.out.println(x == y);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(1));
        System.out.println(person1.equals("string"));
        System.out.println(person1.equals(true));


    }
    public static void Example6(){

        Mutant m1 = new Mutant();
        Human h1 = new Human();
        System.out.println(m1);
        System.out.println(h1);
        System.out.println(h1.toString().equals(m1.toString()));
    }

    public static void Example7(){

        Mutant m1 = new Mutant("Dog", (byte)1);
        Human h1 = new Human("Person", (byte)1);

        System.out.printf("Human age = %d and Mutant" +
                " age = %d%n", h1.getAge(), m1.getAge());

    }
    public static void Example8() {

        //Heart myHeart = new Heart(); //not possible
        Human person1 = new Human();
        System.out.println(person1.pumping);
        System.out.println(person1.isHealthy);

        System.out.println(person1.isHeartHealth());
        person1.pumping = 100;
        System.out.println(person1.isHeartHealth());
        System.out.println(person1.canExercise());
        person1.pumping = 99;
        person1.isHealthy = true;
        System.out.println(person1.canExercise());



    }
    public static void Example9() {

        Mutant m1 = new Mutant();
        System.out.println(m1.isHeartHealth());
        System.out.println(m1.canExercise());

    }
    public static void Example10(){

    try{

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/comp1011_thursday_3pm",
                "root",
                "1"
        );

        System.out.println("Connection successful!");

    }
    catch(java.sql.SQLException e){

        System.err.println("SQL Exception: " + e);
    }

    }
        public static void main(String[] args) {
	// write your code here
//    Liver some = Human.CONSTANT_LIVER;

        Example10();
    }
}
