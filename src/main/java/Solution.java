import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        // because the top of the triangle is row 0
        // add 1 to the row index
        List<Integer> result = new ArrayList<>();

        // add 1 to each spot in the row
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(1);
        }

        // starting from index 1
        for (int i = 1; i < rowIndex; i++) {

            // add the elements at index j and the element at the prior index
            for (int j = i; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        return result;
    }
}
