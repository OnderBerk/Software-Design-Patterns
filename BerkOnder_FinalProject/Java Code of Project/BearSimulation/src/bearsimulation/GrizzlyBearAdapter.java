package bearsimulation;
/*
    Berk Onder 21502378
    Sevki Armagan Oguz 21503106
*/
public class GrizzlyBearAdapter implements BarkBehaviour{

    GrizzlyBear grizzlyBear;

    public GrizzlyBearAdapter(GrizzlyBear grizzlyBear) {
        this.grizzlyBear = grizzlyBear;
    }
    
    @Override
    public void bark() {
         grizzlyBear.roar();
    }
}
