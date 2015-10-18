import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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

    public static void genereFichieYaml(){
        Contacts contact = new Contacts();
        String msg;

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

        System.out.println("Entrez l'email du contact: ");
        msg = lireClavier();
        contact.setEmail(msg);

        Yaml writer = new Yaml();
        try {
            writer.dump(contact, new FileWriter("/home/john/workspace/DSL-Project/src/main/java/contact.yml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fichier YAML genere!!\n");
    }

    public static void lireFichierYaml() throws FileNotFoundException {
        Contacts contact1 = new Contacts();
        Yaml reader = new Yaml();
        FileInputStream input = new FileInputStream("/home/john/workspace/DSL-Project/src/main/java/contact.yml");
        contact1 = (Contacts) reader.load(input);
        System.out.println(contact1.getNom() +"\n" + contact1.getPrenom() + "\n" + contact1.getAdresse() +
                            "\n" + contact1.getTelephone() + "\n" + contact1.getEmail());
    }


    public static void main (String[] args) throws FileNotFoundException {
        genereFichieYaml();
        lireFichierYaml();
    }
}
