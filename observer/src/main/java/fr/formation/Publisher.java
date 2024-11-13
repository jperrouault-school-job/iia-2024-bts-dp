package fr.formation;

import java.util.ArrayList;
import java.util.List;

// C'est notre Observé
public abstract class Publisher {
    // Liste d'observateurs
    private List<Subscriber> subscribers = new ArrayList<>();
    
    // Permet d'ajouter un nouvel observateur
    public void subscribe(Subscriber sub) {
        this.subscribers.add(sub);
    }
    
    // Permet de supprimer un observateur
    public void unsubscribe(Subscriber sub) {
        this.subscribers.remove(sub);
    }

    // Permet d'alerter tous les observateurs
    public void publish() {
        for (Subscriber sub : this.subscribers) {
            sub.update(this);
        }
    }
}
