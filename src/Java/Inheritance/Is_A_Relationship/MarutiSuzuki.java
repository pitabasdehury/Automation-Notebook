package Java.Inheritance.Is_A_Relationship;

public class MarutiSuzuki extends Vechile{

    public MarutiSuzuki(int speed){
        super(speed);
        if (speed >80){
            System.out.println(speed+" km Not recommended speed");
        }else
            System.out.println(speed+ "km Decent speed");
    }

    public MarutiSuzuki(int speed, String color){
        super(color);
        if (color == "Red" && speed >= 90){
            System.out.println("Good speed");
        }else if (color == "Black" && speed >= 70){
            System.out.println("Average speed");
        }else
            System.out.println("Not recommended");
    }
}
