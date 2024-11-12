package rappelspoo;

public class Chat extends Animal implements Chasseur, Proie {
    public Chat(String nom) {
        super(nom);
        System.out.println("CREATION DU CHAT " + nom);
    }

    public Chat() {
        super("- Pas de nom -");
        System.out.println("CREATION D'UN CHAT SANS NOM !");
    }

    @Override
    public void dormir() {
        // super.dormir();
        System.out.println("Le chat dort ...");
    }

    @Override
    public void manger() {
        System.out.println("Le chat mange ...");
    }

    @Override
    public void chasser(Proie proie) {
        System.out.println("Le chat chasse sa proie " + proie);
        proie.mourir(this);
    }

    @Override
    public void mourir(Chasseur chasseur) {
        System.out.println("Le chat se meurt à cause de " + chasseur);
    }

    @Override
    public String toString() {
        return "Le chat " + this.nom;
    }
}
