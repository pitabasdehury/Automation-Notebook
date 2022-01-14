package Java.Abstraction.Abstract;

public class Main {
    public static void main(String[] args) {
       MarutiSuzuki m = new MarutiSuzuki("Black");
      //  MarutiSuzuki m1 = new MarutiSuzuki(10);

        m.Vehicle("Black");
       // Vehicle v = new Vehicle();    // Not-allowed --> Abstract class can not be instantiated
                                        //                  We can not make object of a abstract class

    }
}
