package fr.formation;

// Observateur "Journalisation"
public class LogSubscriber extends Subscriber {
    @Override
    public void update(Publisher pub) {
        System.out.println("JOURNALISATION DANS UN FICHIER ...");
    }
}
