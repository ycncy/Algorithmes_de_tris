import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TriTas {

    public static List<Integer> sort(List<Integer> list) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> newList = new ArrayList<>();
        queue.addAll(list);
        while (!queue.isEmpty()){
            newList.add(queue.poll());
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list = Util.randomList(100, 0, 10);
        System.out.println(list);
        System.out.println(sort(list));
    }
}
