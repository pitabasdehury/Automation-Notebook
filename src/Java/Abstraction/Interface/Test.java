package Java.Abstraction.Interface;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println("TV serial no is : "+tv.tv_serial_no);
        tv.on();
        tv.changeChannel(758);
        tv.volumeUp(4);
        tv.volumeDown(7);
        tv.mute();
        tv.off();
        tv.price(10000);
        tv.menu();

        TvRemote a = new TV();
        a.on();
        a.changeChannel(234);
        a.mute();
        // a.price(12000); // not allowed
    }
}
