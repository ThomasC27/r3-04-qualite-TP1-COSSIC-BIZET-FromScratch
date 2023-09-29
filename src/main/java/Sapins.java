/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class Sapins
{
    public static void main(String[] args){
        String essai= genererSapinPlein(5);
        System.out.println("Essai : " + essai);
    }

    /**
     * permet de retourner une chaîne de caractères avec nb caractères car identiques
     * @param nb  nombre de caractères de la chaîne
     * @param car caractère constituant la chaîne
     * @return la chaîne de caractères de nb caractères car
     */
    public static String genererStringLigne (int nb, char car){
        String ligne;
        int cpt;
        ligne = "";
        cpt = nb;
        while (cpt > 0) {
            ligne = ligne + car;
            cpt = cpt - 1;
        }

        return ligne;
    }

    /**
     * permet de retourner une chaîne de caractères représentant le sapin plein demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin plein
     */
    public static String genererSapinPlein (int h){
        int cpt, nbEspace, nbEtoile;
        String sapinP;
        sapinP = "";
        cpt = h;
        nbEspace = h -1;
        nbEtoile = 1;
        while (cpt>0){
            sapinP = sapinP + genererStringLigne(nbEspace, ' ');
            sapinP = sapinP + genererStringLigne(nbEtoile, '*') + '\n';
            nbEspace = nbEspace - 1;
            nbEtoile = nbEtoile + 2;
            cpt = cpt -1;
        }

        return sapinP; // A modifier
    }

    public static void affichersapinP(int h){
        String sapinPlein;
        sapinPlein = genererSapinPlein(h);
        System.out.println(sapinPlein);
    }

    public static String genererSapinVide (int h) {
        int cpt, nbEspace, nbEspaceM, nbEtoile;
        String sapinV;

        sapinV = "";
        cpt = 1;
        nbEspace = h - 1;
        nbEspaceM = 1;
        nbEtoile = (h*2)-1;
        if(h>1){
            sapinV = sapinV + genererStringLigne(nbEspace, ' ') + '*' + '\n';
        }
        while ( cpt < h - 1 ){
            nbEspace = nbEspace - 1;
            sapinV = sapinV + genererStringLigne(nbEspace, ' ') + '*';
            sapinV = sapinV + genererStringLigne(nbEspaceM, ' ') + '*' + '\n';
            nbEspaceM = nbEspaceM + 2;
            cpt = cpt + 1; 
        }
        sapinV= sapinV + genererStringLigne(nbEtoile,'*');
        return sapinV;
    }

    public static void affichersapinV(int h){
        String sapinV;
        sapinV = genererSapinVide(h);
        System.out.println(sapinV);
    }
    
    public static void genererSapinCouche (int largSapin){
        int nbEtoiles = 0, cpt = 0;
        String sapinC = "";
        while (cpt < largSapin){
            nbEtoiles = nbEtoiles  + 1;
            sapinC = sapinC + genererStringLigne(nbEtoiles,'*') + "\n";
            cpt += 1;
        }
        while (cpt >= 1) {
            nbEtoiles = nbEtoiles - 1;
            sapinC = sapinC + genererStringLigne(nbEtoiles, '*') + "\n";
            cpt = cpt - 1;
        }
        System.out.println(sapinC);
    }
}

