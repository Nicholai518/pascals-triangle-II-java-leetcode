import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<Integer> result = solution.getRow(3);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
