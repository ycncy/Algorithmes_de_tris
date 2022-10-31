import java.util.LinkedList;

public class TriFusion {

    public static LinkedList<Integer> randomLinkedList(int max, int min, int size) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < size; i++) {
            list.add((int) Math.floor(Math.random() * (max - min)));
        }
        return list;
    }

    public static LinkedList<Integer> fusionner(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> list = new LinkedList<>();
        while (list1.size() != 0 && list2.size() != 0) {
            if (list1.getFirst() < list2.getFirst()) {
                list.add(list1.getFirst());
                list1.removeFirst();
            }
            else {
                list.add(list2.getFirst());
                list2.removeFirst();
            }
        } if (list1.size() == 0) {
            list.addAll(list2);
            list2.clear();
        } if (list2.size() == 0) {
            list.addAll(list1);
            list1.clear();
        }
        return list;
    }

    public static LinkedList<Integer> sort(LinkedList<Integer> list){
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() / 2) {
                    list1.add(list.get(i));
                }
                else {
                    list2.add(list.get(i));
                }
            }
            list1 = sort(list1);
            list2 = sort(list2);
            return fusionner(list1, list2);
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = randomLinkedList(100, 0, 10);
        System.out.println(list);
        System.out.println(sort(list));
    }
}

