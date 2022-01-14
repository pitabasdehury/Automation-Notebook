package Java.Inheritance.Is_A_Relationship;
//is-a-relationship : sub-class should inherit the properties of super class ( parent-child relationship. )


public class Vechile {
    String color;

    public Vechile(int speed){
        if (speed>60){
            System.out.println(speed+" k.m Reckless driving");
        }else
            System.out.println("Safe driving");
    }

    public Vechile(String color){
        this.color = color;
        System.out.println("Vechile color is "+this.color);
    }
}
