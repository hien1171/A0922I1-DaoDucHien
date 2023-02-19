package text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static  final String BLANK =" ";
    public static final String DELIMITER=",";

    public static List<Country> readFromFile(String path){
        List<Country> countries= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line= reader.readLine())!=null){
                if(line.trim().equals(BLANK)){
                    continue;
                }
                String [] result = line.split(DELIMITER);
                Country country=new Country(result);
                countries.add(country);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countries;
    }
    public static void writeToFile(String path,List<Country> countryList){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
            for(Country st: countryList){
                writer.write(st.toStringFile());
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ReadWriteFile readWriteFile=new ReadWriteFile();
        List<Country> countries=new ArrayList<>();

        countries.add(new Country(1,"AU","Australia"));
        countries.add(new Country(2,"CN","Aus"));
        countries.add(new Country(3,"CN","China"));
        countries.add(new Country(4,"JP","Japan"));
        countries.add(new Country(5,"CN","China"));
        String path =".\\src\\text_file\\country.csv";
        ReadWriteFile.writeToFile(path,countries);
        ReadWriteFile.readFromFile(path);
        countries.forEach(System.out::println);


    }
}
