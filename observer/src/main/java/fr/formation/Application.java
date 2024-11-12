package fr.formation;

public class Application {
    public static void main(String[] args) {
        ProduitRepository produitRepository = RepositoryFactory.createProduitRepository();

        for (Produit produit : produitRepository.findAll()) {
            System.out.println(produit);
        }
    }
}
