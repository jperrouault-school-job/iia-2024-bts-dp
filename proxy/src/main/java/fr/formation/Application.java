package fr.formation;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ProduitRepository produitRepository = RepositoryFactory.createProduitRepository();

        // Les observateurs
        LogSubscriber logSub = new LogSubscriber();
        KafkaSubscriber kafkaSub = new KafkaSubscriber();

        // On les inscrit à l'observé
        produitRepository.subscribe(logSub);
        produitRepository.subscribe(kafkaSub);
        
        produitRepository.findAll().thenAccept(produits -> {
            for (Produit produit : produits) {
                System.out.println(produit);
            }
        });

        System.out.println("Un message depuis le Thread principal !");
        
        Thread.sleep(3000);
        System.out.println("- Deuxième appel -");

        produitRepository.findAll().thenAccept(produits -> {
            for (Produit produit : produits) {
                System.out.println(produit);
            }
        });
    }
}
