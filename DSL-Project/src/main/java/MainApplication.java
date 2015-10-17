import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Scanner;

/**
 * @author John Marc Dechaud
 * @date 10/17/15.
 */
@SuppressWarnings("all")
public class MainApplication {

    public static String lireClavier() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void main (String[] args) throws IOException {
        Contacts contact = new Contacts();
        String msg = " ";

        System.out.println("Entrez le nom du contact: ");
        msg = lireClavier();
        contact.setNom(msg);

        System.out.println("Entrez le prenom du contact: ");
        msg = lireClavier();
        contact.setPrenom(msg);

        System.out.println("Entrez le numero de telephone: ");
        msg = lireClavier();
        contact.setTelephone(msg);

        System.out.println("Entrez l'adresse du contact: ");
        msg = lireClavier();
        contact.setAdresse(msg);

        System.out.println("Entrez l'email du contact: \n");
        msg = lireClavier();
        contact.setEmail(msg);

        Yaml writer = new Yaml();
        writer.dump(contact, new FileWriter("contact.yml"));
        System.out.println("Fichier YAML genere!!\n");

    }
}
