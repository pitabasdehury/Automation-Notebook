package Java.Abstraction.Abstract;

public class MarutiSuzuki extends Vehicle {


    public MarutiSuzuki(int speed){
        super(speed);
        if (speed >80){
            System.out.println(speed+" km Not recommended speed");
        }else
            System.out.println(speed+ "km Decent speed");
    }

    @Override
    public void Vehicle(String color){
        System.out.println("Vehicle color is "+color);
    }


    public MarutiSuzuki(String color){
        super(color);
        if (color == "Red"){
            System.out.println("Good speed");
        }else if (color == "Black"){
            System.out.println("Average speed");
        }else
            System.out.println("Not recommended");
    }
}
