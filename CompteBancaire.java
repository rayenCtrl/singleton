public class CompteBancaire {
    // Classe représentant un compte bancaire simpliste.
        private int numero;
        private double solde;
        Journalisation js=new Journalisation();
        // Constructeur d'un CompteBancaire à partir de son numéro.
        public CompteBancaire(int numero)
        {
            this.numero=numero;
            this.solde=0.0;
        }
        // Méthode qui permet de déposer de l'argent sur le compte.
        public void deposerArgent(double depot)
        {
            if(depot>0.0)
            {
                solde+=depot;// On ajoute la somme déposée au solde.
                js.ajouterLog
                        ("Dépôt de "+depot+"€ sur le compte "+numero+".");
            }
            else
            {
                js.ajouterLog
                        ("/!\\ Dépôt d'une valeur négative impossible ("+numero+").");
            }

}
    // Méthode qui permet de retirer de l'argent sur le compte.
    public void retirerArgent(double retrait)
    {
        if(retrait>0.0)
        {
            if(solde>=retrait)
            {
                solde-=retrait;// On retranche la somme retirée au solde.
                js.ajouterLog
                        ("Retrait de "+retrait+"€ sur le compte "+numero+".");
            }
            else
            {
                js.ajouterLog("/!\\ La banque n'autorise pas de découvert ("+numero+").");
            }
        }
        else
        {
            js.ajouterLog("/!\\ Rerait d'une valeur négative impossible ("+numero+").");
        }
    }
}