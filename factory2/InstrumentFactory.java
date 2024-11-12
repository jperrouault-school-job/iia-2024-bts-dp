package factory2;

public class InstrumentFactory {
    public static Guitare createGuitare() {
        return new Guitare();
        // return new Ukulele();
    }
}
