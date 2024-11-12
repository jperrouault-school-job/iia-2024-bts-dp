package rappelspoo;

public class AppRappels {
    public static void main(String[] args) {
        Animal albert = new Chat();

        // ((Chat)albert).setNom("Albert");
        
        // if (albert instanceof Chat) {
        //     Chat chat = (Chat)albert;

        //     chat.setNom("Albert");
        //     System.out.println("Le chat s'appelle " + chat.getNom());
            
        //     // ((Chat)albert).setNom("Albert");
        //     // System.out.println("Le chat s'appelle " + ((Chat)albert).getNom());
        // }

        if (albert instanceof Chat chat) {
            chat.setNom("Albert");
            System.out.println("Le chat s'appelle " + chat.getNom());
        }

        albert.dormir();
        albert.manger();
    }
}
