package Champion;

import com.codethesis.pgnparse.MalformedMoveException;
import com.codethesis.pgnparse.PGNGame;
import com.codethesis.pgnparse.PGNParseException;
import com.codethesis.pgnparse.PGNParser;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by johan on 17/10/15.
 */
public class Resultat {

    public static void resultatPrint(String fichier){
        List<PGNGame> jeux;
        try {
            jeux = PGNParser.parse(fichier);
        } catch (PGNParseException | MalformedMoveException | IOException e) {
            System.err.println(fichier+" erreur de lecture");
            return;
        }
        resultat(jeux);
    }

    public static void resultat (List<PGNGame> jeux){
        String res;
        for (PGNGame jeu : jeux) {
            res = "L'evenement " + jeu.getTag("Event");
            res += " a eu lieu a " + jeu.getTag("Site");
            res += " le " + jeu.getTag("Date");
            String[] blanc = jeu.getTag("White").split(", ");
            if (blanc.length == 2){
                res += "\nIl a vu s'affronter " + blanc[1] + " " + blanc[0];
            }
            else {
                res += "\nIl a vu s'affronter " + blanc[0];
            }
            String[] noir = jeu.getTag("Black").split(", ");
            if (noir.length == 2) {
                res += " et " + noir[1] + " " + noir[0];
            }
            else {
                res += " et " + noir[0];
            }
            res += "\n\n";

            if (jeu.getTag("Result").equals("1-0")) {
                res += "victoire de ";
                if (blanc.length == 2) {
                    res += blanc[1] + " " + blanc[0];
                }
                else {
                    res += blanc[0];
                }
            }
            else if (jeu.getTag("Result").equals("0-1")) {
                res += "victoire de ";
                if (noir.length == 2) {
                    res += noir[1] + " " + noir[0];
                }
                else {
                    res += noir[0];
                }
            }
            else if (jeu.getTag("Result").equals("1/2-1/2")) {
                res += "match nul";
            }
            else if (jeu.getTag("Result").equals("*")) {
                res += "parti en cour";
            }
            System.out.println(res +"\n");
        }
    }

    public static void main(final String[] args) {
        for (String fichier : args) {
            try {
                fichier = IOUtils.toString(new FileInputStream(fichier));
            } catch (IOException e) {
                System.err.println(fichier + " erreur de lecture");
            }
            resultatPrint(fichier);
        }
    }
}
