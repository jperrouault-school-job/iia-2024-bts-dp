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
        if (chasseur instanceof Chat) {
            System.out.println("La souris fait un looping !");
        }

        System.out.println("La souris se meurt ... :( par " + chasseur);
    }

    @Override
    public String toString() {
        return "La souris " + this.nom;
    }

    public static void demoStatic() {
        System.out.println("La méthode statique !");
    }
}
