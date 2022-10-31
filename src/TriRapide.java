import java.util.List;

public class TriRapide {

    public static void sort(List<Integer> suite, int first, int last) {
        if(first < last) {
            int a = first; int b = last;
            int pivot = suite.get((a + b)/2);
            while(a <= b) {
                while(suite.get(a) < pivot) {
                    a += 1;
                }
                while(suite.get(b) > pivot) {
                    b -= 1;
                }
                if(a <= b) {
                    Util.permutation(suite, a, b);
                    a += 1;
                    b -= 1;
                }
            }
            sort(suite, first, b);
            sort(suite, a, last);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Util.randomList(100, 0, 10);
        System.out.println(list);
        sort(list, 0, list.size() - 1);
        System.out.println(list);
    }
}
