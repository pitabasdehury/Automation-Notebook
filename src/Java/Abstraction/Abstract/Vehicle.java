package Java.Abstraction.Abstract;

public abstract class Vehicle {
        String color;

        public Vehicle(int speed){
            if (speed>60){
                System.out.println(speed+" k.m Reckless driving");
            }else
                System.out.println("Safe driving");
        }

        public Vehicle(String color) {
            System.out.println("This is a new vehicle");
        }


        public abstract void Vehicle(String color);
    }

