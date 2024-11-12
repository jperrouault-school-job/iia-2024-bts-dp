package rappelspoo;

public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
        System.out.println("CREATION D'UN CHIEN !");
    }

    @Override
    public void dormir() {
        System.out.println("Le chien dort ...");
    }
}
