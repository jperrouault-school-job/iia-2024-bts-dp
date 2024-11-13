package fr.formation;

public class Application {
    public static void main(String[] args) {
        ProduitRepository produitRepository = RepositoryFactory.createProduitRepository();

        // Les observateurs
        LogSubscriber logSub = new LogSubscriber();
        KafkaSubscriber kafkaSub = new KafkaSubscriber();

        // On les inscrit à l'observé
        produitRepository.subscribe(logSub);
        produitRepository.subscribe(kafkaSub);

        for (Produit produit : produitRepository.findAll()) {
            System.out.println(produit);
        }

        System.out.println("- Deuxième appel -");

        for (Produit produit : produitRepository.findAll()) {
            System.out.println(produit);
        }
    }
}
