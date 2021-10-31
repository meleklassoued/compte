package Compte;

public class compte {
    private float solde;
    private String nom;
    private String prénom;

    public compte() {}

    public void setSolde(float solde){
        this.solde ;
        
    }
    
    public void desposer(float solde) {
        this.solde += solde;
    }


    

    public void retirer(float solde) {
        this.solde -= solde;
    }

    public void afficher() {
        System.out.println("les informations de comptes sont : ");
        System.out.println("le solde est : " + this.solde + "le nom et le prenom de titulaire est : " + this.nom + " "
                + this.prénom);

    }

}
