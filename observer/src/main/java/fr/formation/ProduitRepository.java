package fr.formation;

import java.util.List;

public class ProduitRepository {
    public List<Produit> findAll() {
        return List.of(
            Produit.builder().id("p1").nom("Produit 1").build(),
            Produit.builder().id("p2").nom("Produit 2").build(),
            Produit.builder().id("p3").nom("Produit 3").build()
        );
    }
}
