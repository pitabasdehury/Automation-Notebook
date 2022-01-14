package Java.Abstraction.Interface;

public interface TvRemote {
    int tv_serial_no = 213;
    void on();
    void off();
    void volumeUp(int increament);
    void volumeDown(int decreament);
    void mute();
    void changeChannel(int channelNo);
}
