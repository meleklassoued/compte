package Compte;

public class compte {
    private float solde;
    private String nom;
    private String prénom;

    public compte() {
    }

    /* ------------------------ getter et setter de solde ----------------------- */
    public void setSolde(float solde) {
        this.solde = solde;
    }

    public float getSolde() {
        return this.solde;
    }
    /* ---------------------- fin setter getter pour solde ---------------------- */

    /* ------------------------ getter et setter de Nom ----------------------- */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }
    /* ---------------------- fin setter getter pour Nom---------------------- */

    /*
     * ------------------------ getter et setter de preNom -----------------------
     */

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getPrénom() {
        return this.prénom;
    }
    /* ---------------------- fin setter getter pour preNom---------------------- */

    public void desposer(float solde) {
        this.solde += solde;
    }

    public void retirer(float solde) {
        this.solde -= solde;
    }

    public void transfert(float d, compte autre) {
        autre.retirer(d);
        this.solde += d;
    }

    public void afficher() {
        System.out.println("les informations de comptes sont : ");
        System.out.println("le solde est : " + this.solde + "le nom et le prenom de titulaire est : " + this.nom + " "
                + this.prénom);

    }

}
