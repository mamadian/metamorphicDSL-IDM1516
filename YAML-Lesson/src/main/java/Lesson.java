import org.yaml.snakeyaml.Yaml;

import java.io.StringWriter;

public class Lesson {
    private String name;
    private String room;
    private int nbHours;
    private String teacherAddress;

    public Lesson(String n, String r, int nb, String a){
        name = n;
        room = r;
        nbHours = nb;
        teacherAddress = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getNbHours() {
        return nbHours;
    }

    public void setNbHours(int nbHours) {
        this.nbHours = nbHours;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String address) {
        this.teacherAddress = address;
    }

    public static void main(String [] args){
        Lesson lesson1 = new Lesson("IDM","i50",2,"mathieu.acher@inria.fr");
        Lesson lesson2 = new Lesson("AOC","i52",2,"noel.plouzeau@univ-rennes1.fr");
        Lesson [] lessons = {lesson1, lesson2};
        Yaml yaml = new Yaml();
        StringWriter writer = new StringWriter();
        yaml.dump(lessons, writer);
        System.out.println(writer.toString());
    }
}
