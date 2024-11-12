package rappelspoo;

public class Chat {
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

    public void dormir() {
        System.out.println("Le chat dort ...");
    }

}
