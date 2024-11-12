package rappelspoo;

public abstract class Animal {
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

    public Animal(String nom) {
        this.setNom(nom);
        System.out.println("CREATION D'UN ANIMAL !");
    }

    public void dormir() {
        System.out.println("L'animal dort ...");
    }

    // public void manger() {
    //     System.out.println("L'animal mange ...");
    // }

    public abstract void manger();
}
