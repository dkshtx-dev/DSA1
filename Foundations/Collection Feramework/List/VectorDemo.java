import java.util.Vector;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class VectorDemo {
    public static void main(String[] args) {

        // ==================== Constructors of Vector ====================
        System.out.println("===== Constructors of Vector =====");

        // 1. Vector() — default initial capacity = 10
        Vector<String> v1 = new Vector<>();
        System.out.println("Vector() - capacity default 10: " + v1);

        // 2. Vector(int initialCapacity) — custom initial capacity
        Vector<String> v2 = new Vector<>(20);
        System.out.println("Vector(20) - custom initial capacity: " + v2);

        // 3. Vector(int initialCapacity, int capacityIncrement)
        //    — grows by 'capacityIncrement' when capacity is exceeded
        Vector<String> v3 = new Vector<>(5, 3);
        System.out.println("Vector(5, 3) - capacity=5, increment=3: " + v3);

        // 4. Vector(Collection<? extends E> c) — from existing collection
        Vector<String> v4 = new Vector<>(List.of("Apple", "Banana", "Cherry"));
        System.out.println("Vector(Collection): " + v4);

        // ==================== Methods in Vector ====================
        System.out.println("\n===== Methods in Vector =====");

        Vector<String> fruits = new Vector<>();

        // 1. add(E e) — adds element at the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("After add(): " + fruits);

        // 2. add(int index, E element) — inserts element at specified index
        fruits.add(2, "Blueberry");
        System.out.println("After add(2, Blueberry): " + fruits);

        // 3. get(int index) — retrieves element at specified index
        System.out.println("get(0): " + fruits.get(0));
        System.out.println("get(3): " + fruits.get(3));

        // 4. set(int index, E element) — replaces element at specified index
        fruits.set(1, "Blackberry");
        System.out.println("After set(1, Blackberry): " + fruits);

        // 5. remove(Object o) — removes FIRST occurrence of the specified element
        fruits.remove("Cherry");
        System.out.println("After remove(Cherry): " + fruits);

        // 6. remove(int index) — removes element at specified index
        String removed = fruits.remove(0);
        System.out.println("remove(0) removed: " + removed);
        System.out.println("After remove(0): " + fruits);

        // 7. size() — returns number of elements currently in the vector
        System.out.println("size(): " + fruits.size());

        // 8. isEmpty() — returns true if vector has no elements
        System.out.println("isEmpty(): " + fruits.isEmpty());

        // 9. contains(Object o) — returns true if element is present
        System.out.println("contains(Banana): " + fruits.contains("Banana"));
        System.out.println("contains(Mango): " + fruits.contains("Mango"));

        // 10. clear() — removes ALL elements from the vector
        System.out.println("\nBefore clear(): " + fruits);
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("isEmpty() after clear: " + fruits.isEmpty());

        // ==================== Capacity & Increment Behavior ====================
        System.out.println("\n===== Capacity & Increment Behavior =====");

        // Vector with capacity=3 and increment=2
        // When capacity is exceeded, it grows by 'increment' amount
        Vector<Integer> nums = new Vector<>(3, 2);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println("After 3 adds (capacity=3): " + nums + " | capacity: " + nums.capacity());
        nums.add(40); // exceeds capacity → grows by increment (3+2=5)
        System.out.println("After 4th add (grew by 2): " + nums + " | capacity: " + nums.capacity());
        nums.add(50);
        nums.add(60); // exceeds again → grows to 5+2=7
        System.out.println("After 6th add (grew by 2 again): " + nums + " | capacity: " + nums.capacity());

        // ==================== Synchronization & Performance ====================
        System.out.println("\n===== Synchronization & Performance =====");

        /*
         * KEY CONCEPT:
         * Vector is SYNCHRONIZED — all its methods (add, remove, get, set, etc.)
         * are marked with the 'synchronized' keyword internally.
         *
         * This means:
         *   ✅ Only ONE thread can access the vector at a time → Thread-Safe
         *   ❌ In single-threaded environments, this locking/unlocking adds overhead
         *      → Slower than ArrayList in single-threaded use
         *
         * Modern Java Recommendation:
         *   → Use ArrayList when thread safety is NOT needed (faster)
         *   → Use CopyOnWriteArrayList or Collections.synchronizedList()
         *     from java.util.concurrent for thread-safe collections
         *   → Vector is considered a legacy class (since Java 1.0)
         */

        // Demonstrating Vector is synchronized — safe to use in multi-threaded scenarios
        Vector<Integer> safeList = new Vector<>();

        // Two threads both adding to the same Vector
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) safeList.add(i);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) safeList.add(i);
        });

        try {
            t1.start(); t2.start();
            t1.join();  t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Collections.sort(safeList);
        System.out.println("Vector after 2 threads adding 1-5 and 6-10: " + safeList);
        System.out.println("Size (expected 10): " + safeList.size()
                + (safeList.size() == 10 ? " ✅ Thread-safe!" : " ❌ Data lost!"));
    }
}
