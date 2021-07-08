package bearsimulation;
import java.util.ArrayList;
import java.util.Iterator;
/*
    Berk Onder 21502378
    Sevki Armagan Oguz 21503106
*/
public class Flock implements BarkBehaviour {

    ArrayList barkers = new ArrayList();

    public void add(BarkBehaviour barker) {
        barkers.add(barker);
    }

    public void bark() {
        Iterator iterator = barkers.iterator();
        while (iterator.hasNext()) {
            BarkBehaviour barker = (BarkBehaviour) iterator.next();
            barker.bark();
        }
    }
}
