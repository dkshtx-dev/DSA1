import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {

        // 1. Creation
        ArrayList<String> fruits = new ArrayList<>();

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

        // 4. get(index)
        System.out.println("get(0): " + fruits.get(0));

        // 5. set(index, element)
        fruits.set(1, "Blackberry");
        System.out.println("After set(1, Blackberry): " + fruits);

        // 6. remove(index)
        System.out.println("remove(4) removed: " + fruits.remove(4));

        // 7. remove(Object)
        System.out.println("remove(Cherry): " + fruits.remove("Cherry"));
        System.out.println("After removes: " + fruits);

        // 8. size() & isEmpty()
        System.out.println("size(): " + fruits.size());
        System.out.println("isEmpty(): " + fruits.isEmpty());

        // 9. contains()
        System.out.println("contains(Apple): " + fruits.contains("Apple"));

        // 10. indexOf() & lastIndexOf()
        fruits.add("Apple"); // duplicate
        System.out.println("indexOf(Apple): " + fruits.indexOf("Apple"));
        System.out.println("lastIndexOf(Apple): " + fruits.lastIndexOf("Apple"));

        // 11. subList()
        System.out.println("subList(1, 3): " + fruits.subList(1, 3));

        // 12. addAll()
        ArrayList<String> more = new ArrayList<>();
        more.add("Fig");
        more.add("Grape");
        fruits.addAll(more);
        System.out.println("After addAll(): " + fruits);

        // 13. sort, reverse & shuffle
        Collections.sort(fruits);
        System.out.println("After sort(): " + fruits);
        Collections.reverse(fruits);
        System.out.println("After reverse(): " + fruits);
        Collections.shuffle(fruits);
        System.out.println("After shuffle(): " + fruits);

        // 14. min, max & frequency
        System.out.println("min: " + Collections.min(fruits));
        System.out.println("max: " + Collections.max(fruits));
        System.out.println("frequency of Apple: " + Collections.frequency(fruits, "Apple"));

        // 15. toArray()
        String[] arr = fruits.toArray(new String[0]);
        System.out.print("toArray: ");
        for (String s : arr) System.out.print(s + " ");
        System.out.println();

    }
}
