import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by OLIVIER Julien on 12/10/2015.
 */
public class Main {
    private Document doc;
    private Element house;
    private Element location;
    private Element owner;
    private Element price;
    private Element numberOfRoom;
    private Element rooms;
    private int nbRoom;

    private void init(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            doc = docBuilder.newDocument();
            house = doc.createElement("maison");
            doc.appendChild(house);

            // elements
            location = doc.createElement("lieu");
            house.appendChild(location);
            owner = doc.createElement("proprietaire");
            house.appendChild(owner);
            price = doc.createElement("prix");
            house.appendChild(price);
            numberOfRoom = doc.createElement("nombrePiece");
            house.appendChild(numberOfRoom);
            rooms = doc.createElement("pieces");
            house.appendChild(rooms);
            nbRoom = 0;
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
    }

    private void addRoom(String name, String type, String owner, String area) {
        Element piece = doc.createElement("piece");
        piece.setAttribute("id", "" + nbRoom);
        Element eltNom = doc.createElement("nom");
        eltNom.appendChild(doc.createTextNode(name));
        Element eltType = doc.createElement("type");
        eltType.appendChild(doc.createTextNode(type));
        Element eltSurface = doc.createElement("surface");
        eltSurface.appendChild(doc.createTextNode(area));
        Element eltProprietaire = doc.createElement("proprietaire");
        if(type == "Prive"){
            eltProprietaire.appendChild(doc.createTextNode(owner));
        }

        piece.appendChild(eltNom);
        piece.appendChild(eltType);
        piece.appendChild(eltProprietaire);
        piece.appendChild(eltSurface);

        nbRoom++;
        numberOfRoom.setTextContent(""+nbRoom);
        rooms.appendChild(piece);
    }
    private void addInfoHouse(String vLocation, String vOwner, String vPrice){
        location.setTextContent(vLocation);
        owner.setTextContent(vOwner);
        price.setTextContent(vPrice);
    }

    public static void main(String argv[]) {
        Main main = new Main();
        // Init du DOM
        main.init();
        main.addInfoHouse("3 rue des Oubliés", "Julien OLIVIER", "150000");
        main.addRoom("Chambre 1", "Prive", "Parents", "12");
        main.addRoom("Chambre 2", "Prive", "Enfant 1", "10");
        main.addRoom("Chambre 3", "Prive", "Enfant 2", "8");
        main.addRoom("Salon", "Commune", "", "24");
        main.addRoom("Cuisine", "Commune", "", "6");
        try{
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(main.doc);
            StreamResult result = new StreamResult(new File("D:\\file.xml"));

            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
