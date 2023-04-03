package search;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class increasingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = input.nextLine();

        List<Character> max=new LinkedList<>();

        for(int i=0;i<str.length();i++){
            LinkedList<Character> list =new LinkedList<>();
            list.add(str.charAt(i));

            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }

            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
            System.out.println();

        }

        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }



    }
}
