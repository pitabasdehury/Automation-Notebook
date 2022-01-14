package Java.Polymorphim.MethodOverriding;

public class Test {
    public static void main(String[] args) {
        /*
        // Static (compile-time) polymorphism
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.reFuel();
        bmw.color();
         */


        // Or
        // Run-time polymorphism  /  Dynamic Method Dispatch / Top Casting
        Car car = new BMW();    // Allowed --> Child class object with Parent class reference

        car.start();        // Override method will run , here java is deciding which method will run
        car.reFuel();
        car.stop();
       // car.color;    -->  can not call and give error, here also java is deciding which method will run

       // BMW bmw = new Car();    // Not-allowed --> Parent class object with Child class reference
    }
}
