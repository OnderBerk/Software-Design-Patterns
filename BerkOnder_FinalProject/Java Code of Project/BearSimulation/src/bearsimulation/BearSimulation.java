package bearsimulation;
/*
    Berk Onder 21502378
    Sevki Armagan Oguz 21503106
*/
public class BearSimulation {

    public static void main(String[] args) {
        BearSimulation simulator = new BearSimulation();
        AbstractBearFactory bearFactory = new CountingBearFactory();
        simulator.simulate(bearFactory);
    }

    void simulate(AbstractBearFactory bearFactory) {
        BarkBehaviour panda = bearFactory.createPandaBear();
        BarkBehaviour polar = bearFactory.createPolarBear();
        BarkBehaviour grizzly = new GrizzlyBearAdapter(new GrizzlyBear());
        System.out.println("\nBear Simulator: With Composite - Flocks");
        
        Flock flockOfBears = new Flock();
        flockOfBears.add(polar);
        flockOfBears.add(panda);
        flockOfBears.add(grizzly);
        
        Flock flockOfPandaBears = new Flock();
        
        BarkBehaviour pandaOne = bearFactory.createPandaBear();
        BarkBehaviour pandaTwo = bearFactory.createPandaBear();
        BarkBehaviour pandaThree = bearFactory.createPandaBear();
        BarkBehaviour pandaFour = bearFactory.createPandaBear();
        
        flockOfPandaBears.add(pandaOne);
        flockOfPandaBears.add(pandaTwo);
        flockOfPandaBears.add(pandaThree);
        flockOfPandaBears.add(pandaFour);
        flockOfBears.add(flockOfPandaBears);
        
        System.out.println("\nBear Simulator: Whole Flock Simulation");
        simulate(flockOfBears);
        
        System.out.println("\nBear Simulator: Panda Flock Simulation");
        simulate(flockOfPandaBears);
        
        System.out.println("\nThe Bears Barked " + BarkCounter.getNumberOfBarks() + " times");
    }

    void simulate(BarkBehaviour bear) {
        bear.bark();
    }

}
