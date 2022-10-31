import java.util.List;

public class TriBulle {

    public static void sort(List<Integer> list) {
        for(int i = list.size() - 1; i >= 2; i--) {
            for(int j = 0; j < i; j++) {
                if(list.get(j) > list.get(j + 1)) {
                    Util.permutation(list, j, j + 1);
                }
            }
        }
    }

    public static void main(String args[]) {
        List<Integer> list = Util.randomList(100, 0, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
}
