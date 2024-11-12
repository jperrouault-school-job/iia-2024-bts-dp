package rappelspoo;

public class AppRappels {
    public static void main(String[] args) {
        Chat albert = new Chat();

        albert.setNom("Albert");

        System.out.println("Le chat s'appelle " + albert.getNom());

        albert.dormir();
    }
}
