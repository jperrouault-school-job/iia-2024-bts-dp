package fr.formation;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObserverDecorator extends ProduitRepository {
    private final ProduitRepository produitRepository;

    @Override
    public CompletableFuture<List<Produit>> findAll() {
        this.publish();
        
        return this.produitRepository.findAll();
    }
}
