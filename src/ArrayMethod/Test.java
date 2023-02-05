package ArrayMethod;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(7);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
//        System.out.println(arr);
    }
}
