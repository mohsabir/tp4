package smartbank;

public class ComptePremium extends Compte {

    private double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde, double plafondRetrait) {
        super(numero, titulaire, solde);
        this.plafondRetrait = plafondRetrait;
    }

    @Override
    public boolean retirer(double montant) {
        if (montant <= plafondRetrait && solde >= montant) {
            solde -= montant;
            return true;
        }
        return false;
    }
}