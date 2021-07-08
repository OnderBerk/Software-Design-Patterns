package bearsimulation;
/*
    Berk Onder 21502378
    Sevki Armagan Oguz 21503106
*/
public class CountingBearFactory extends AbstractBearFactory {

    public BarkBehaviour createPolarBear() {
        return new BarkCounter(new PolarBear());
    }

    public BarkBehaviour createPandaBear() {
        return new BarkCounter(new PandaBear());
    }
}
