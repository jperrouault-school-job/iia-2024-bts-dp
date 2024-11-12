package factory2;

public class Guitariste {
    // private Guitare guitare = InstrumentFactory.createGuitare();
    private Guitare guitare;

    public void setGuitare(Guitare guitare) {
        this.guitare = guitare;
    }
    
    public void jouer() {
        System.out.println("Le guitariste joue ... " + guitare);
    }

}
