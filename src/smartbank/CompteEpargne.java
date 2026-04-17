package smartbank;

public class CompteEpargne extends Compte {

    private double tauxInteret;

    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) {
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        solde += solde * tauxInteret;
    }

    @Override
    public boolean retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
            return true;
        }
        return false;
    }
}
