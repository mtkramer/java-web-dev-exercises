package exercises.technology;

public class SmartPhone extends Computer {

    private int volume;
    private boolean muted = false;

    public SmartPhone(String aMake, double aGHz, int aPixels, int aVolume) {
        super(aMake, aGHz, aPixels);
        this.volume = aVolume;
    }

    public void mute (){
        if(!this.muted){
            this.muted = true;
            this.volume = 0;
        } else {
            this.muted = false;
            this.volume = 5;
        }
    }

}