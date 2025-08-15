import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsDuplicatesInArray {
    public static void removeDuplicates(int [] array) {
        List<Integer> list = new ArrayList<>();
        for (int j : array) {
            if (!list.contains(j)) {
                list.add(j);
            }
        }
        System.out.println("Arrays with elements duplicate: "+ Arrays.toString(array));
        System.out.println("Matrices without duplicate elements: "+list);
    }
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,2,3,2,5,1,7,8,9});
    }
}
