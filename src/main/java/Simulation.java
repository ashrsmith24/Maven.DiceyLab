public class Simulation{
    Bins bins = new Bins();
    private Dice dice = new Dice();

    public Bins getBins() {
        return bins;
    }

    public void rollingTheDice(){
    for (int i = 0; i < 20; i++) {
         bins.store(dice.toss());
    }


}

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.rollingTheDice();
        System.out.println(simulation.getBins().bins.toString());
    }
}

