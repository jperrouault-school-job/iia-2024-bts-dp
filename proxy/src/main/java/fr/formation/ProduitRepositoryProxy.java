package fr.formation;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProduitRepositoryProxy extends ProduitRepository {
    private final ProduitRepository produitRepository;

    private List<Produit> produitsCached;

    @Override
    public List<Produit> findAll() {
        if (this.produitsCached == null) {
            this.produitsCached = this.produitRepository.findAll();
        }

        return this.produitsCached;
    }
}
