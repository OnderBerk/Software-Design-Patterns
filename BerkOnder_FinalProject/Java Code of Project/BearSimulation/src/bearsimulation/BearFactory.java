package bearsimulation;
/*
    Berk Onder 21502378
    Sevki Armagan Oguz 21503106
*/
public class BearFactory extends AbstractBearFactory {

    public BarkBehaviour createPolarBear() {
        return new PolarBear();
    }

    public BarkBehaviour createPandaBear() {
        return new PandaBear();
    }
}
