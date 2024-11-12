package rappelspoo;

public class Chat extends Animal {
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
}
