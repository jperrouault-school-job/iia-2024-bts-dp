package fr.formation;

// Observateur "Kafka"
public class KafkaSubscriber extends Subscriber {
    @Override
    public void update(Publisher pub) {
        System.out.println("ENVOI D'UN MESSAGE KAFKA ...");
    }
}
