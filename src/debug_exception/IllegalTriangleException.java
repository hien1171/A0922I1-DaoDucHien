package debug_exception;

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources_zh_TW;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
        } catch(Exception e) {
            System.err.println("k hop le");
        }
    }
}
