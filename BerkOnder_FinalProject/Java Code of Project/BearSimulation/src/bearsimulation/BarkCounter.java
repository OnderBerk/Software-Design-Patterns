package bearsimulation;
/*
    Berk Onder 21502378
    Sevki Armagan Oguz 21503106
*/
public class BarkCounter implements BarkBehaviour{

    BarkBehaviour bear;
    static int numberOfBarks;

    public BarkCounter(BarkBehaviour bear) {
        this.bear = bear;
    }
    
    @Override
    public void bark() {
        bear.bark();
        numberOfBarks++;
    }

    public static int getNumberOfBarks() {
        return numberOfBarks;
    }
    
    
}
