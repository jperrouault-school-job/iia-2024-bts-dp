package rappelspoo;

public class Souris extends Animal implements Proie {
    public Souris(String nom) {
        super(nom);
        System.out.println("CREATION DE LA SOURIS ...");
    }

    @Override
    public void manger() {
        System.out.println("La souris mange ...");
    }

    @Override
    public void mourir(Chasseur chasseur) {
        System.out.println("La souris se meurt ... :( par " + chasseur);
    }

    @Override
    public String toString() {
        return "La souris " + this.nom;
    }
}
