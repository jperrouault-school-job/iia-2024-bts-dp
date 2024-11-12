package rappelspoo;

public class Chat extends Animal {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.length() < 2) {
            return;
        }

        this.nom = nom;
    }

    @Override
    public void dormir() {
        // super.dormir();
        System.out.println("Le chat dort ...");
    }

}
