<?php
	class Contact{

		function createContact() {
			$contact = array(
			    “Nom” => Diallo ,
			    “Prenom” => Mamadian,
			    “Age” => 25,
			    “NumeroTel” => array(
					  “Mobile” => 206-555-1234,
						“ Portable” => 206-555-5678,
						 “Bureau” =>  206-555-7654
					)
				);

			$fichier = “contact.yml”;
			file_put_contents($fichier, var_dump(yaml_emit ($contact)));
		}
	}
?>

