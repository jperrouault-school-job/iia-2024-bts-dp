package fr.formation;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ProduitRepository extends Publisher {
    @Async
    public CompletableFuture<List<Produit>> findAll() {
        System.out.println("CHARGEMENT ASYNCHRONE dans le thread ... " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        }
        
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        return CompletableFuture.completedFuture(
            List.of(
                Produit.builder().id("p1").nom("Produit 1").build(),
                Produit.builder().id("p2").nom("Produit 2").build(),
                Produit.builder().id("p3").nom("Produit 3").build()
            )
        );
    }
}
