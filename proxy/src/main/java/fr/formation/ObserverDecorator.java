package fr.formation;

import java.util.List;

import lombok.RequiredArgsConstructor;

// @AllArgsConstructor
@RequiredArgsConstructor
public class ObserverDecorator extends ProduitRepository {
    private final ProduitRepository produitRepository;

    // public ObserverDecorator(ProduitRepository produitRepository) {
    //     this.produitRepository = produitRepository;
    // }

    @Override
    public List<Produit> findAll() {
        this.publish();
        
        return this.produitRepository.findAll();
    }
}
