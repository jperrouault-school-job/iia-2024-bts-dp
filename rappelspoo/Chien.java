package rappelspoo;

public class Chien extends Animal implements Chasseur {
    public Chien(String nom) {
        super(nom);
        System.out.println("CREATION D'UN CHIEN !");
    }

    @Override
    public void dormir() {
        System.out.println("Le chien dort ...");
    }

    @Override
    public void manger() {
        System.out.println("Le chien mange ...");
    }

    @Override
    public void chasser(Proie proie) {
        System.out.println("Le chien chasse sa proie " + proie);
        proie.mourir(this);
    }

    @Override
    public String toString() {
        return "Le chien " + this.nom;
    }
}
