package fr.formation;

public class RepositoryFactory {
    private RepositoryFactory() { }

    public static ProduitRepository createProduitRepository() {
        ProduitRepository produitRepository = new ProduitRepository();

        produitRepository = new AsyncProduitRepositoryProxy(produitRepository);
        produitRepository = new ProduitRepositoryProxy(produitRepository);
        produitRepository = new ObserverDecorator(produitRepository);

        return produitRepository;
    }
}
