package exercises.technology;

public abstract class AbstractEntity {

    private static int nextID = 1;
    private final int ID;

    public AbstractEntity(){
        this.ID = nextID;
        nextID++;
    }

    public int getID(){
        return ID;
    }

}
