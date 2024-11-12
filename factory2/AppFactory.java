package factory2;

public class AppFactory {
    public static void main(String[] args) {
        // Guitariste guitariste = new Guitariste();
        Guitariste guitariste = MusicienFactory.createGuitariste();

        guitariste.jouer();
    }
}
