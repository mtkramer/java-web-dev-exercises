package exercises.technology;

public class Computer extends AbstractEntity{

    private String make;
    private double GHz;
    private int pixels;
    private boolean powerOn = false;

    public Computer(String aMake, double aGHz, int aPixels){
        super();
        this.make = aMake;
        this.GHz = aGHz;
        this.pixels = aPixels;
    }

    public String getMake() {
        return make;
    }

    public double getGHz() {
        return GHz;
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public String runProgram(){
        return "Hello, World!";
    }

    public void powerButton(){
        this.powerOn = !this.powerOn;
    }

}
