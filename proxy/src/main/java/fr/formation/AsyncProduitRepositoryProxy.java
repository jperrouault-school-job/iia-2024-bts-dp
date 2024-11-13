package fr.formation;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AsyncProduitRepositoryProxy extends ProduitRepository {
    private final ProduitRepository produitRepository;

    @Override
    public CompletableFuture<List<Produit>> findAll() {
        CompletableFuture<List<Produit>> futureProduits = new CompletableFuture<>();

        try {
            if (produitRepository.getClass().getMethod("findAll").getAnnotation(Async.class) != null) {
                new Thread(() -> {
                    try {
                        futureProduits.complete(this.produitRepository.findAll().get());
                    }
                    
                    catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }
                }).start();
            }

            else {
                futureProduits.complete(this.produitRepository.findAll().get());
            }
        }
        
        catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println("Impossible d'exécuter cette méthode ...");
        }

        return futureProduits;
    }
}
