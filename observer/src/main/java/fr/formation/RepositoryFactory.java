package fr.formation;

public class RepositoryFactory {
    private RepositoryFactory() { }

    public static ProduitRepository createProduitRepository() {
        return new ProduitRepository();
    }
}
