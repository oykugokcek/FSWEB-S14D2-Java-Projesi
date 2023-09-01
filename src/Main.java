import Room.Bedroom;
import houseware.Lamp;
import houseware.LampType;

public class  Main {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp(LampType.DESK, true, 5);

        myLamp.turnOn();
        System.out.println("Style: " + myLamp.getStyle());
        System.out.println("Battery: " + myLamp.isBattery());
        System.out.println("Global Rating: " + myLamp.getGlobRating());



        System.out.println("Hello world!");

        Bedroom myBedroom = new Bedroom("1.", myLamp)
    }
}