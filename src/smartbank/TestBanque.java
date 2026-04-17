package smartbank;

public class TestBanque {

    public static void main(String[] args) {

        Compte[] comptes = new Compte[4];

        comptes[0] = new CompteCourant("C1", "SABIR", 1000, 500);
        comptes[1] = new CompteEpargne("E1", "MOHAMED", 2000, 0.05);
        comptes[2] = new ComptePremium("P1", "Youssef", 3000, 1000);
        comptes[3] = new CompteCourant("C2", "MINA", 500, 300);

        for (Compte c : comptes) {
            c.deposer(100);
            c.retirer(200);
            c.afficher();
            System.out.println("------------------");
        }

        System.out.println("=== Comptes Epargne ===");
        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                System.out.println(c);
            }
        }
    }
}