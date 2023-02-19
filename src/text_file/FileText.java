package text_file;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FileText {
    public static final String BLANK = "";

    public static List<String> readFile(String path){
        List<String> strings=new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static void writeFile(String path, List<String> strings) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(path))){
            for (String str: strings) {
                wr.write(str);
                wr.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyF(String sourceFile,String targetFile){
        writeFile(targetFile,readFile(sourceFile));
    }

    public static void main(String[] args) {
        copyF("D:\\CodeGym\\Module1\\Module2\\Java\\src\\io_text_file\\copy_file\\source.txt","D:\\CodeGym\\Module1\\Module2\\Java\\src\\io_text_file\\copy_file\\target.txt");
    }







}
