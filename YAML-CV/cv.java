/* Using https://github.com/EsotericSoftware/yamlbeans */

class MyCV {

    public static void main (String[] args){

        CV cv = new CV();
        cv.name = "VALLEE";
        cv.firstname = "Hugo";
        cv.age = 23;
        cv.skill = "M2 MIAGE";
        cv.favouriteWebsite = "OpenCompare";
        language[] languages = {"java" => "pro", "c#" => "not so bad", "YAML" => "Very bad"};
        cv.languages = languages;
        YamlWriter writer = new YamlWriter(new FileWriter("cv.yml"));
        writer.write(cv);
        writer.close();
    }
}