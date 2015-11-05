/*
    OLIVIER Julien
*/


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace ConsoleApplication1
{
    class Program
    {
        private XmlWriter writer;
        public int nbRoom;
        public void init()
        {
            nbRoom = 0;
            using (writer = XmlWriter.Create("D:\\fileC.xml"))
            {
                writer.WriteStartDocument();
                    startNewHouse();
                        startGroupOfRoom();
                            addRoom("Chambre 1", "Prive", "Parents", "12");
                            addRoom("Chambre 2", "Prive", "Enfant 1", "10");
                            addRoom("Chambre 3", "Prive", "Enfant 2", "8");
                            addRoom("Salon", "Commune", "", "24");
                            addRoom("Cuisine", "Commune", "", "6");
                        endGroupOfRoom();
                        addInfoHouse("3 rue des Oubliés", "Julien OLIVIER", "150000", nbRoom);
                    endNewHouse();
                writer.WriteEndDocument();
            }
        }
        public void startNewHouse()
        {
            writer.WriteStartElement("maison");
        }
        public void endNewHouse()
        {
            writer.WriteEndElement();
        }
        public void addInfoHouse(String vLocation, String vOwner, String vPrice, int vNbRoom)
        {
            writer.WriteElementString("lieu", vLocation);
            writer.WriteElementString("proprietaire", vOwner);
            writer.WriteElementString("prix", vPrice);
            writer.WriteElementString("nombrePiece", vNbRoom.ToString());
        }
        public void startGroupOfRoom()
        {
            writer.WriteStartElement("pieces");
        }
        public void endGroupOfRoom()
        {
            writer.WriteEndElement();
        }
        public void addRoom(String name, String type, String owner, String area)
        {
            writer.WriteStartElement("piece");
            writer.WriteAttributeString("id", ""+nbRoom);
            writer.WriteElementString("nom", name);
            writer.WriteElementString("type", type);
            writer.WriteElementString("proprietaire", owner);
            writer.WriteElementString("surface", area);
            writer.WriteEndElement();
            nbRoom++;
        }
        
        static void Main(string[] args)
        {
            Program prg = new Program();
            prg.init();
        }
    }
}
