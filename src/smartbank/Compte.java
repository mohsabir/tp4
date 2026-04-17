package smartbank;

public class Compte {

    protected String numero;
    protected String titulaire;
    protected double solde;

    public Compte(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public boolean retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
            return true;
        }
        return false;
    }

    public void afficher() {
        System.out.println("Numéro : " + numero +
                ", Titulaire : " + titulaire +
                ", Solde : " + solde);
    }
}