Public class Contact {

	 private String nom;
	 private String prenom;
         private int age;
	 private List<Phone> numeroTel;
	 
	 public Contact(String nom, String prenom, int age, List<Phone> numeroTel){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.numeroTel=numeroTel;
	 }


	public class Phone {
	    private String nom;
	    private String numero;
	}
	public static void main (String[] arg) {
		List<Phone> phone= new ArrayList<Phone>();
		phone.add(new Phone(“Mobile”, 206-555-1234));
		phone.add(new Phone(“Portable” ,206-555-5678));
		phone.add(new Phone(“Bureau”,  206-555-7654));
		Contact contact= new Contact ( “Diallo”, “Mamadian” ,25, phone);

		YamlWriter writer = new YamlWriter(new FileWriter("contact.yml"));
		writer.getConfig().setClassTag("contact", Contact.class);
		writer.write(contact);
		writer.close();
	}
}

