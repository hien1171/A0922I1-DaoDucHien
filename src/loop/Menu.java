package loop;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice=-1;
        Scanner input= new Scanner(System.in);
        while(choice!=0){
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the right triangle with right angles at bottom_left");
            System.out.println("3.  Draw the right triangle with right angles at top_left");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int length,width;
                    System.out.println("Enter your length");
                    length= input.nextInt();
                    System.out.println("Enter your width");
                    width= input.nextInt();
                    drawRectangle(length,width);
                    break;
                case 2:
                    int height;
                    System.out.println("Enter your height");
                    height=input.nextInt();
                    drawTriangle1(height);
                    break;
                case 3:
                    int height2;
                    System.out.println("Enter your height");
                    height2=input.nextInt();
                    drawTriangle2(height2);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }


            }
        }
        public static void  drawRectangle(int length,int width){

            for(int i=0;i<width;i++){
                for(int j=0;j<length;j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }

        }
        public static void drawTriangle1(int h){
            for (int i = 0; i <h ; i++) {
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

       public static void drawTriangle2(int h){
           for (int i = h; i >0 ; i--) {
               for(int j=0;j<i;j++){
                       System.out.print("*");
                   }
                   System.out.print("\n");
               }
           }


    }

