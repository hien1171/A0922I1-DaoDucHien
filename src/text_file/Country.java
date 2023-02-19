package text_file;

public class Country {
    int id;
    String code;
    String name;

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
    public Country(String[] str){
        this.id=Integer.parseInt(str[0]);
        this.code=str[1];
        this.name=str[2];
    }

    @Override
    public String toString() {
        return this.id+","+this.code+","+this.name;
    }

    public String toStringFile() {
        return id+","+code+","+name;
    }
}
