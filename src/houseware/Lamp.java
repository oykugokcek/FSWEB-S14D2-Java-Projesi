package houseware;

public class Lamp {
    private LampType lampType;
    private boolean battery;
    private int globRating;

    public Lamp(LampType lampType, boolean battery, int globRating) {
        this.lampType = lampType;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return lampType;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on");
    }


}
