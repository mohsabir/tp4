package smartbank;

public class CompteCourant extends Compte {

    private double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public boolean retirer(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
            return true;
        }
        return false;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Découvert autorisé : " + decouvertAutorise);
    }
}