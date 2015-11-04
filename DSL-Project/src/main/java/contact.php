<!-- I use Spyc,it is a YAML loader/dumper written in pure PHP.link :https://github.com/mustangostang/spyc/ -->

<?php

require_once "Spyc.php";


class Contact
{
    public function setup()
    {
        $this->yamlParser = new YamlParser();
    }

    public function createYAML()
    {
	// Fonction de l'api permetant de mettre un tableau sous YML.
        $ymlFormat = Spyc::YAMLDump(array(
            "nom" => "Dechaud",
            "prenom" => "John Marc",
            "telephone" => "06XXXXXXXX"
            "adresse" => "4 Ave Mitterand",
            "email" => "deco@gmail.com",
             5, 50);
    }
}
?>
