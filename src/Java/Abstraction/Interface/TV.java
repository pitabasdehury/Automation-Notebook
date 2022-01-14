package Java.Abstraction.Interface;

public class TV implements TvRemote, TvSwitches{
    public void on(){
        System.out.println("TV ON");
    }
    public void off(){
        System.out.println("TV OFF");
    }
    public void volumeUp(int increament){
        System.out.println("Increasing volume level "+increament);
    }
    public void volumeDown(int decreament){
        System.out.println("Decreasing volume level "+decreament);
    }
    public void mute(){
        System.out.println("Volume mute");
    }
    public void changeChannel(int channelNo){
        System.out.println("Changing channel to "+channelNo);
    }
    void price(int price){
        System.out.println("TV price is :+price");
    }

    public void menu(){
        System.out.println("Menu window will pop-up");
    }
}
