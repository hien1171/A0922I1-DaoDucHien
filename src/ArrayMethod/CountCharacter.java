package ArrayMethod;
import java.util.Scanner;


public class CountCharacter {
    public static void main(String[] args) {
        int count=0;
        String str="sjndidnsdijdjnisdndyrgyeqwuyw";
        char c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("String : "+str);
        System.out.println("Enter the character :");
        c=scanner.next().charAt(0);
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==c){
                count++;
            }
        }
        System.out.print(" The character '"+c+"' appear "+count+ " times.");
    }
}
