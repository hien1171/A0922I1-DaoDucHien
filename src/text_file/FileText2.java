package text_file;

import  text_file.Student;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileText2 {
    public static  final String BLANK =" ";
    public static final String DELIMITER=",";

    public static List<Student> readFromFile(String path){
        List<Student> students= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line= reader.readLine())!=null){
                if(line.trim().equals(BLANK)){
                    continue;
                }
                String [] result = line.split(DELIMITER);
                Student student=new Student(result);
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
          return students;
    }

    public static void writeToFile(String path,List<Student> studentList){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(path))){
            for(Student st: studentList){
                writer.write(st.toStringFile());
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

   /* private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
    */
   public static void copyF(String sourceFile,String targetFile){
       writeToFile(targetFile, readFromFile(sourceFile));
   }

    public static void main(String[] args) {
        FileText2 fileText2 = new FileText2();
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hoang Nam", 7f));
        students.add(new Student(2, "Khanh Huyen", 8.5f));
        students.add(new Student(3, "Van Hoai", 7.5f));
        students.add(new Student(4, "Khanh Van", 9.5f));
        students.add(new Student(5, "Hoai Son", 6.5f));
        fileText2.writeToFile(".\\src\\text_file\\source.csv",students);
        List<Student> students1 = FileText2.readFromFile(".\\src\\text_file\\source.csv");
        students1.forEach(System.out::println);

    }
}
