package factory2;

public class MusicienFactory {
    public static Guitariste createGuitariste() {
        Guitariste guitariste = new Guitariste();

        guitariste.setGuitare(InstrumentFactory.createGuitare());

        return guitariste;
    }
}
