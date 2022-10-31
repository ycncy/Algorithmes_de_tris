import java.util.ArrayList;
import java.util.List;

public class Util {

    public static void permutation(List<Integer> suite, int i, int j) {
        int temp = suite.get(i);
        suite.set(i, suite.get(j));
        suite.set(j, temp);
    }

    public static List<Integer> randomList(int max, int min, int size) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            list.add((int) Math.floor(Math.random() * (max - min)));
        }
        return list;
    }
}
