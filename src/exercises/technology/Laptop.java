package exercises.technology;

public class Laptop extends Computer {

    private double batteryLifeSeconds;

    public Laptop(String aMake, double aGHz, int aPixels, double abatteryLifeSeconds) {
        super(aMake, aGHz, aPixels);
        this.batteryLifeSeconds = abatteryLifeSeconds;
    }

    public void charging(){
        this.batteryLifeSeconds += 100;
    }

}
