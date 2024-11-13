package fr.formation;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProduitRepositoryProxy extends ProduitRepository {
    private final ProduitRepository produitRepository;

    private CompletableFuture<List<Produit>> produitsCached;

    @Override
    public CompletableFuture<List<Produit>> findAll() {
        if (this.produitsCached != null && this.produitsCached.isDone()) {
            try {
                return CompletableFuture.completedFuture(this.produitsCached.get());
            }
            
            catch (Exception e) {
                Thread.currentThread().interrupt();
            } 
        }

        if (this.produitsCached == null) {
            this.produitsCached = this.produitRepository.findAll();
        }

        return this.produitsCached;
    }
}
