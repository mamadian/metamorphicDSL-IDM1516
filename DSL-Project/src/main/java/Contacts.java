/**
 * @author John Marc Dechaud
 * @Date 10/15/2015
 */
@SuppressWarnings("all")
public class Contacts{

    private String nom;
    private String prenom;
    private String telephone;
    private String adresse;
    private String email;

    public Contacts() {
        this.nom = " ";
        this.prenom = " ";
        this.telephone = " ";
        this.adresse = " ";
        this.email = " ";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
