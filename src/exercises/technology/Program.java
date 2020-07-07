package exercises.technology;

public class Program {
    public static void main(String[] args){
        Computer T1000 = new Computer("CyberPower", 3.3, 7600);
        System.out.println(T1000.getID());
        Computer T100 = new Computer("Clone", 1.0, 640);
        System.out.println(T100.getID());
        Computer T10 = new Computer("Clone", 1.0, 640);
        System.out.println(T10.getID());
    }
}
