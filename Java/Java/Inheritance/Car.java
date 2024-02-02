package Java.Inheritance;



public class Car extends Vehicle {

    Integer numDoors = 4;

    public void startEngine(){
        System.out.println(" Engine is Started.");
    }

    public void numDoors(){
        System.out.println(" The Car has" +numDoors+" Doors.");
    }


    public static void main(String[] args) {

        Car  C = new Car();
        C.displayInfo();
        C.startEngine();
        C.numDoors();
    }

    }




