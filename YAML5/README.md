Devoir de IDM

Diallo Mamadian M2 GLA

YAML:  acronyme de Ain't Markup Language est un langage ou format de représentation de donnée. Il reprend un peu les concepts du langage XML. C’est un langage de DSL parce que non seulement on peut écrire directement des fichier YAML mais on peut aussi utiliser d’autres langage pour écrire des fichiers en YAML ou de parser des fichier en YAML.
Ainsi dans ce devoir je vais présenter comment écrire un fichier YAMLet comment faire la même chose les langages JAVA et PHP.

Fichier YAML: Dans ce context on va essayer de fabriquer fichier qui permet de stocker un contact . Ce fichier sera appelé  contact.yml
Un contact est représenter par son nom son prénom son âge et une liste de numéro de téléphone.

Equivalent en Php:  Pour créer ce même fichier contact.yml en PHP on procède comme suit:
Créer un tableau contenant les données 
puis appelé la fonction yaml_emit qui permet de genere un le fichier correspondant en yml


Equivalent en java: Pour créer ce même fichier contact.yml en JAVA on procède comme suit:
On commence par creer une classe contact qui a pour attribut nom prénom âge et numeroTel
On cree une classe tel 
on cree une instance de ce contact
puis on utilise la classe YamlWriter de java pour créer le fichier contact.yml


