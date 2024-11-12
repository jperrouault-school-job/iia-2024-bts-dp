package rappelspoo;

public class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
        System.out.println("CREATION DU CHAT " + nom);
    }

    @Override
    public void dormir() {
        // super.dormir();
        System.out.println("Le chat dort ...");
    }
}
