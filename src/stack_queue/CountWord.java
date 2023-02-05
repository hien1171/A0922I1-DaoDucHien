package stack_queue;
import java.util.TreeMap;
public class CountWord {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMapWord =new TreeMap<>();
        String str=" jdshbdddinbd dfjdn ";
        String[] arrayStrings=str.split(" ");
        for(int i=0; i<arrayStrings.length; i++)
        {
            if(treeMapWord.containsKey(arrayStrings[i]))
            {
                int newValue=treeMapWord.get(arrayStrings[i]);
                treeMapWord.put(arrayStrings[i],++newValue);
            }else {
                treeMapWord.put(arrayStrings[i],1);
            }
        }
        System.out.println(treeMapWord);
    }
}
