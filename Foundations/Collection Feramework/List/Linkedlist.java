import java.util.LinkedList;
import java.util.Collections;

public class Linkedlist {
    public static void main(String[] args) {

        // 1. Creation
        LinkedList<String> fruits = new LinkedList<>();

        // 2. add(element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("After add(): " + fruits);

        // 3. add(index, element)
        fruits.add(2, "Blueberry");
        System.out.println("After add(2, Blueberry): " + fruits);

        // 4. addFirst() & addLast() — LinkedList specific
        fruits.addFirst("Avocado");
        fruits.addLast("Fig");
        System.out.println("After addFirst & addLast: " + fruits);

        // 5. get(index), getFirst(), getLast()
        System.out.println("get(0): " + fruits.get(0));
        System.out.println("getFirst(): " + fruits.getFirst());
        System.out.println("getLast(): " + fruits.getLast());

        // 6. set(index, element)
        fruits.set(1, "Blackberry");
        System.out.println("After set(1, Blackberry): " + fruits);

        // 7. remove(index)
        System.out.println("remove(4) removed: " + fruits.remove(4));

        // 8. remove(Object)
        System.out.println("remove(Cherry): " + fruits.remove("Cherry"));
        System.out.println("After removes: " + fruits);

        // 9. removeFirst() & removeLast() — LinkedList specific
        System.out.println("removeFirst(): " + fruits.removeFirst());
        System.out.println("removeLast(): " + fruits.removeLast());
        System.out.println("After removeFirst & removeLast: " + fruits);

        // 10. size() & isEmpty()
        System.out.println("size(): " + fruits.size());
        System.out.println("isEmpty(): " + fruits.isEmpty());

        // 11. contains()
        System.out.println("contains(Apple): " + fruits.contains("Apple"));

        // 12. indexOf() & lastIndexOf()
        fruits.add("Blackberry"); // duplicate
        System.out.println("indexOf(Blackberry): " + fruits.indexOf("Blackberry"));
        System.out.println("lastIndexOf(Blackberry): " + fruits.lastIndexOf("Blackberry"));

        // 13. peek(), peekFirst(), peekLast() — returns null if empty (no exception)
        System.out.println("peek(): " + fruits.peek());
        System.out.println("peekFirst(): " + fruits.peekFirst());
        System.out.println("peekLast(): " + fruits.peekLast());

        // 14. poll(), pollFirst(), pollLast() — removes & returns, null if empty
        System.out.println("pollFirst(): " + fruits.pollFirst());
        System.out.println("pollLast(): " + fruits.pollLast());
        System.out.println("After polls: " + fruits);

        // 15. push() & pop() — Stack behavior (LIFO)
        fruits.push("Mango");   // adds at front (like addFirst)
        fruits.push("Papaya");  // adds at front
        System.out.println("After push(Mango, Papaya): " + fruits);
        System.out.println("pop(): " + fruits.pop()); // removes from front
        System.out.println("After pop: " + fruits);

        // 16. sort, reverse & shuffle
        Collections.sort(fruits);
        System.out.println("After sort(): " + fruits);
        Collections.reverse(fruits);
        System.out.println("After reverse(): " + fruits);
        Collections.shuffle(fruits);
        System.out.println("After shuffle(): " + fruits);

        // 17. min, max & frequency
        System.out.println("min: " + Collections.min(fruits));
        System.out.println("max: " + Collections.max(fruits));
        System.out.println("frequency of Mango: " + Collections.frequency(fruits, "Mango"));

    }
}
