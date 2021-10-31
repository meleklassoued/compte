import Compte.compte;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("donner la taille du tableau des compte ");
        int taille = clavier.nextInt();
        compte[] tab = new compte[taille];

        // ! remplissage du tableau :

        for (int i = 0; i < tab.length; i++) {
            tab[i] = new compte();
            int indiceTab = i + 1;
            System.out.println("le compte " + indiceTab);
            System.out.println("donner le nom ");
            System.out.println("donner le prenom ");
            String nom = clavier.nextLine();
            String Prenom = clavier.nextLine();
            tab[i].setNom(nom);
            tab[i].setPrénom(Prenom);

            tab[i].desposer(100 + i);

        }

        for (int i = 0; i < tab.length - 1; i++) {

            int trans = 10;
            tab[i].transfert(trans, tab[i + 1]);

        }
        for (int i = 0; i < tab.length; i++) {
            tab[i].afficher();
        }

    }
}
