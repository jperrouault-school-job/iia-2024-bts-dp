package rappelspoo;

import java.util.ArrayList;
import java.util.List;

public class AppRappels {
    public static void main(String[] args) {
        Animal albert = new Chat("Albert");
        Animal bernard = new Chat();

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



        List<Animal> animaux = new ArrayList<>();
        // Shift + Alt + O

        animaux.add(albert);
        animaux.add(bernard);
        animaux.add(new Chien("Norbert"));

        // Pour chaque animal contenu dans animaux
        for (Animal animal : animaux) {
            animal.dormir();
        }
    }
}
