package access_modifier;

public class Student {
    private String name="John";
    private String classes="A09";
    Student(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
 class Test{
    public static void main(String[] args) {
        Student x=new Student();
        x.setName("hien");
        x.setClasses("a00");
    }
}
