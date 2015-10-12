<!-- https://github.com/mustangostang/spyc/ -->

<?php

require_once "Spyc.php";


class Cv
{

    public function setup()
    {
        $this->yamlParser = new YamlParser();
    }

    public function createYAML()
    {
        $yaml = Spyc::YAMLDump(array(
            "name" => "VALLEE",
            "firstname" => "Hugo",
            "age" => 23,
            "skill" => "M2 MIAGE",
            "employed" => False,
            "favouriteWebsite" => "OpenCompare",
            "languages" =>
                array(
                    "java" => "Pro",
                    "c#" => "Not so bad",
                    "YAML" => "Very bad"
                )
        ), 4, 60);
    }
}
?>
