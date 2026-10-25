import java.util.*;

/**
 * ============================================================================
 *                         HASHMAP IN JAVA - COMPLETE GUIDE
 * ============================================================================
 *
 * 1. The Map Interface & Core Concepts
 *    - Standalone interface: Not a subtype of Collection (unlike List, Set, Queue).
 *    - Key-Value pairs: Maps unique Keys to Values (Dictionary analogy: Word -> Definition).
 *    - Unique Keys: Duplicate keys are not allowed (inserting a duplicate overwrites existing value).
 *    - Duplicate Values: Multiple keys CAN point to the exact same value.
 *    - One Value Per Key: Each key maps to at most one value.
 *    - Student Registry Analogy: Roll Numbers = Keys, Student Names = Values.
 *      Two students can have the same name ("Akshit Sharma"), but can never share a Roll Number.
 *
 * 2. HashMap Basics, Characteristics & Methods
 *    - Primary Map implementation in java.util.
 *    - Unordered: Insertion order is NOT preserved.
 *    - Null Handling: At most 1 null key (overwritten on repeat), multiple null values allowed.
 *    - Thread Safety: Not synchronized by default (not thread-safe).
 *    - Constant Time: O(1) average lookup/insertion vs O(n) linear search in List.
 *    - Essential Methods: put(), get(), containsKey(), containsValue(), remove(), size(), isEmpty().
 *    - Looping: keySet() vs entrySet() (with in-place setValue()).
 *
 * 3. Internal Architecture of HashMap
 *    - 4 Core Pillars: Key, Value, Bucket Array (Node<K,V>[] table, default size = 16), Hash Function.
 *    - put() / get() mechanism:
 *        Step 1: Hash the key -> key.hashCode() & hash spread (h ^ (h >>> 16))
 *        Step 2: Calculate index -> Index = hashCode % capacity, or (capacity - 1) & hash
 *        Step 3: Store/retrieve node at calculated bucket index.
 *
 * 4. Hash Collisions & Java 8 Treeification
 *    - Collision: Two distinct keys produce the same hash code or map to the same bucket index.
 *    - Demonstration: simpleHash("ABC") == simpleHash("CBA").
 *    - Resolution: Separate Chaining (Linked List of Node(hash, key, value, next)).
 *    - Retrieval during collision: Jump to bucket index, traverse list comparing keys with .equals().
 *    - Java 8 Red-Black Tree: When bucket entries reach TREEIFY_THRESHOLD (8) and capacity >= 64,
 *      the Linked List converts to a Balanced Red-Black Tree, improving lookup from O(n) to O(log n).
 *    - Walkthrough: Fruit Store example (Apple, Banana, Orange, Grape).
 *
 * 5. Resizing & Rehashing (Load Factor)
 *    - Default initial capacity: 16
 *    - Default load factor: 0.75f (75%)
 *    - Threshold: Capacity * Load Factor = 16 * 0.75 = 12
 *    - Rehashing: When size > 12, capacity doubles to 32, all keys are rehashed and redistributed.
 *    - Custom constructor: new HashMap<>(initialCapacity, loadFactor).
 *
 * 6. Custom Objects as Keys (hashCode & equals Contract)
 *    - Built-in types (String, Integer) already override hashCode() and equals() properly.
 *    - Custom objects inherit Object.equals() and Object.hashCode() based on memory address.
 *    - Problem Demo: PersonWithoutOverrides -> duplicate entries added (size = 3), lookup fails!
 *    - Solution Demo: PersonWithOverrides -> overriding both based on fields properly updates
 *      designation and keeps size = 2.
 *
 * 7. Operational Time Complexity Summary
 *    - put(), get(), remove(), containsKey(): Average O(1), Worst O(log n) (treeified bucket)
 *    - containsValue(): O(n) (scans all entries across all buckets)
 *    - size(), isEmpty(): O(1) (tracked internal field)
 * ============================================================================
 */
public class HashMapDemo {

    public static void main(String[] args) {

        // ====================================================================
        // 1. THE MAP INTERFACE & CORE CONCEPTS (STUDENT REGISTRY EXAMPLE)
        // ====================================================================
        System.out.println("==================================================");
        System.out.println(" 1. THE MAP INTERFACE & CORE CONCEPTS");
        System.out.println("==================================================");

        /*
         * Map is NOT a Collection subtype:
         *   - ArrayList, LinkedList, Stack extend Collection<E> and store single elements.
         *   - Map<K, V> is a separate interface designed for Key-Value pairs.
         *
         * Key-Value Mapping:
         *   - Dictionary analogy: Word (Key) -> Definition (Value).
         *   - Student Registry: Roll Number (Key) -> Student Name (Value).
         *   - Two students can share the same name ("Akshit Sharma"),
         *     but two students can NEVER share the same Roll Number!
         */
        HashMap<Integer, String> studentRegistry = new HashMap<>();
        studentRegistry.put(101, "Akshit Sharma");
        studentRegistry.put(102, "Neha Verma");
        studentRegistry.put(103, "Akshit Sharma"); // Duplicate Value allowed!
        System.out.println("Student Registry (Roll Number -> Name):");
        System.out.println(studentRegistry);
        System.out.println("Notice: Duplicate names allowed under different Roll Numbers (101 & 103).");


        // ====================================================================
        // 2. HASHMAP BASICS, PROPERTIES & ESSENTIAL METHODS
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 2. HASHMAP BASICS, PROPERTIES & METHODS");
        System.out.println("==================================================");

        // Instantiation
        HashMap<Integer, String> map = new HashMap<>();

        // 2.1 put(K, V) & Key Uniqueness
        map.put(1, "Akshit");
        map.put(2, "Neha");
        map.put(3, "Shubham");
        System.out.println("Initial map after 3 inserts: " + map);

        // Overwrite demo: key 2 already exists
        map.put(2, "Mehul"); // Overwrites "Neha" with "Mehul"
        System.out.println("After map.put(2, \"Mehul\") [Overwriting key 2]: " + map);

        // 2.2 get(K)
        String student = map.get(3);
        System.out.println("map.get(3)  -> " + student);
        String unknown = map.get(69);
        System.out.println("map.get(69) -> " + unknown + " (Returns null when key doesn't exist)");

        // 2.3 containsKey(K) [O(1)] & containsValue(V) [O(n)]
        System.out.println("map.containsKey(2): " + map.containsKey(2) + " [O(1) hash lookup]");
        System.out.println("map.containsValue(\"Shubham\"): " + map.containsValue("Shubham") + " [O(n) linear search, case-sensitive]");

        // 2.4 remove(K) & conditional remove(K, V)
        map.put(31, "Nitin");
        System.out.println("\nAdded key 31: " + map);

        boolean removedWrong = map.remove(31, "Rahul"); // Won't remove because value doesn't match
        System.out.println("map.remove(31, \"Rahul\") [value mismatch]: " + removedWrong);

        boolean removedCorrect = map.remove(31, "Nitin"); // Removes only if key maps to "Nitin"
        System.out.println("map.remove(31, \"Nitin\") [value matches]: " + removedCorrect);

        map.put(31, "Temporary");
        map.remove(31); // Unconditional remove by key
        System.out.println("After map.remove(31): " + map);

        // 2.5 size() and isEmpty() [O(1)]
        System.out.println("map.size(): " + map.size() + " [O(1) via tracked size field]");
        System.out.println("map.isEmpty(): " + map.isEmpty() + " [O(1)]");


        // ====================================================================
        // 3. NULL HANDLING & THREAD SAFETY
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 3. NULL HANDLING & THREAD SAFETY");
        System.out.println("==================================================");

        /*
         * Null Handling:
         *   - At most ONE null key is allowed (stored at bucket index 0).
         *   - Adding a second null key overwrites the first null key's value.
         *   - MULTIPLE null values are allowed.
         *
         * Thread Safety:
         *   - HashMap is NOT synchronized by default (not thread-safe).
         *   - Concurrent modification by multiple threads without synchronization
         *     can cause race conditions or corrupt internal bucket chains.
         *   - Use Collections.synchronizedMap(map) or ConcurrentHashMap for thread safety.
         */
        map.put(null, "FirstNullValue");
        System.out.println("After inserting null key: " + map);

        map.put(null, "OverwrittenNullValue"); // Overwrites existing null key
        System.out.println("After putting null key again: " + map);

        map.put(90, null);
        map.put(91, null); // Multiple null values allowed
        System.out.println("After inserting multiple null values: " + map);

        // Cleanup nulls for subsequent clean demos
        map.remove(null);
        map.remove(90);
        map.remove(91);


        // ====================================================================
        // 4. TWO WAYS TO LOOP OVER A HASHMAP
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 4. TWO WAYS TO LOOP OVER A HASHMAP");
        System.out.println("==================================================");

        // Method 1: Using keySet()
        // keySet() returns a Set of all unique keys.
        // Requires a second lookup map.get(key) for each key -> slightly less efficient.
        System.out.println("--- Method 1: Looping via keySet() ---");
        for (int k : map.keySet()) {
            System.out.println("Key: " + k + " -> Value: " + map.get(k));
        }

        // Method 2: Using entrySet()
        // entrySet() returns a Set of Map.Entry<K, V> objects.
        // Both key and value are retrieved in a single pass without extra lookups.
        // Allows in-place value modification using entry.setValue()!
        System.out.println("\n--- Method 2: Looping via entrySet() (In-place Uppercase) ---");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Entry -> " + entry.getKey() + ": " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase()); // In-place modification
        }
        System.out.println("Map after entrySet() modification: " + map);


        // ====================================================================
        // 5. PERFORMANCE COMPARISON: LIST O(n) VS HASHMAP O(1)
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 5. PERFORMANCE: LIST O(n) vs HASHMAP O(1)");
        System.out.println("==================================================");

        List<Integer> list = Arrays.asList(2, 4, 32, 43, 4, 432);
        System.out.println("list.contains(32)  -> " + list.contains(32) + " [Takes O(n) linear search]");
        System.out.println("map.containsKey(2) -> " + map.containsKey(2) + " [Takes O(1) direct hash lookup]");


        // ====================================================================
        // 6. INTERNAL ARCHITECTURE OF HASHMAP
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 6. INTERNAL ARCHITECTURE & INDEX CALCULATION");
        System.out.println("==================================================");

        /*
         * Four Foundational Components:
         *   1. Key: Identifier used for storage and lookup.
         *   2. Value: Data associated with the key.
         *   3. Bucket (Internal Array): Node<K,V>[] table (default size = 16).
         *   4. Hash Function: Deterministic algorithm converting key to an integer hash code.
         *
         * Storage & Retrieval Steps:
         *   Step 1: Calculate hashCode() of Key.
         *   Step 2: Apply bitwise spread function: h ^ (h >>> 16) to prevent clustering.
         *   Step 3: Calculate bucket index using modulo:
         *           Index = hashCode % Array_Size
         *           Optimized in Java via bitwise AND: Index = (n - 1) & hash  (when n is power of 2)
         */
        int sampleKey = 11;
        int h = Integer.valueOf(sampleKey).hashCode();
        int hash = h ^ (h >>> 16);
        int capacity = 16;
        int indexModulo = Math.abs(hash % capacity);
        int indexBitwise = (capacity - 1) & hash;

        System.out.println("Demonstrating Index Calculation for Key: " + sampleKey);
        System.out.println("  1. Key hashCode        : " + h);
        System.out.println("  2. Spread Hash         : " + hash);
        System.out.println("  3. Index via modulo (%) : " + indexModulo);
        System.out.println("  4. Index via (n - 1)&h  : " + indexBitwise + " [Matches modulo exactly!]");


        // ====================================================================
        // 7. HASH COLLISIONS & JAVA 8 TREEIFICATION
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 7. HASH COLLISIONS & JAVA 8 TREEIFICATION");
        System.out.println("==================================================");

        /*
         * What is a Collision?
         *   - Infinite possible keys mapped into a finite bucket array (size 16).
         *   - Two distinct keys can generate the same hash code or map to the same bucket index.
         */
        System.out.println("Collision Example via custom simpleHash():");
        System.out.println("  simpleHash(\"ABC\") -> " + simpleHash("ABC"));
        System.out.println("  simpleHash(\"CBA\") -> " + simpleHash("CBA") + " [Identical hash collision!]");

        /*
         * How HashMap Resolves Collisions:
         *   1. Linked List (Separate Chaining):
         *      - Each bucket holds a Linked List of Node(hash, key, value, next).
         *      - On collision, new entry is appended to the linked list at that bucket.
         *      - On get(key), Java jumps to index, then traverses the list comparing keys using .equals().
         *
         *   2. Java 8 Optimization (Red-Black Tree):
         *      - If many elements collide in one bucket, list traversal degrades to O(n).
         *      - Once a bucket reaches TREEIFY_THRESHOLD = 8 (and total capacity >= 64),
         *        the Linked List converts to a Balanced Binary Search Tree (Red-Black Tree).
         *      - This improves worst-case lookup from O(n) to O(log n)!
         */

        /*
         * Fruit Store Walkthrough Example:
         *   map.put("Apple",  50) -> hash -> index 9
         *   map.put("Banana", 30) -> hash -> index 4
         *   map.put("Orange", 80) -> hash -> index 14
         *   map.put("Grape",  20) -> hash -> index 14 [COLLISION with Orange!]
         *   "Grape" is appended as next node in the Linked List at Index 14.
         *   Bucket 14 length = 2 (< 8), so it remains a Linked List.
         */
        System.out.println("\nFruit Store Simulation (Bucket Capacity = 16):");
        simulateFruitInsertion("Apple", 50, 9);
        simulateFruitInsertion("Banana", 30, 4);
        simulateFruitInsertion("Orange", 80, 14);
        simulateFruitInsertion("Grape", 20, 14); // Collides at index 14


        // ====================================================================
        // 8. RESIZING & REHASHING (LOAD FACTOR)
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 8. RESIZING & REHASHING (LOAD FACTOR)");
        System.out.println("==================================================");

        /*
         * Resizing Parameters:
         *   - Default Initial Capacity = 16
         *   - Default Load Factor      = 0.75f (75%)
         *   - Threshold Calculation    = Capacity * Load Factor = 16 * 0.75 = 12
         *
         * Rehashing Process:
         *   - When the 13th element is inserted (size > 12), the internal array DOUBLES (16 -> 32).
         *   - Because capacity changed from 16 to 32, the modulo formula changes.
         *   - Java recalculates the bucket index for every existing entry and redistributes them.
         *
         * Custom Constructor:
         *   HashMap<Integer, String> customMap = new HashMap<>(17, 0.5f);
         */
        int initCap = 16;
        float loadFactor = 0.75f;
        int threshold = (int) (initCap * loadFactor);
        System.out.println("Default Initial Capacity : " + initCap);
        System.out.println("Default Load Factor      : " + loadFactor + " (75%)");
        System.out.println("Threshold (16 * 0.75)    : " + threshold);
        System.out.println("Rehash Trigger           : When size > " + threshold + ", capacity doubles to 32 and entries rehash.");

        HashMap<Integer, String> customMap = new HashMap<>(17, 0.5f);
        System.out.println("Custom map instantiated with capacity 17 and load factor 0.5f: " + customMap);


        // ====================================================================
        // 9. CUSTOM OBJECTS AS KEYS (hashCode & equals CONTRACT)
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 9. CUSTOM OBJECTS AS KEYS (hashCode & equals)");
        System.out.println("==================================================");

        /*
         * Built-in types (String, Integer) already override hashCode() and equals()
         * based on their actual value/contents.
         *
         * Custom classes inherit Object class implementations by default:
         *   - Object.hashCode() -> uses internal MEMORY ADDRESS.
         *   - Object.equals()   -> uses reference comparison (this == obj).
         */

        // --- PROBLEM: Class WITHOUT hashCode() and equals() overridden ---
        System.out.println("--- Problem Demo: Without hashCode() & equals() overridden ---");
        HashMap<PersonWithoutOverrides, String> badMap = new HashMap<>();
        PersonWithoutOverrides p1 = new PersonWithoutOverrides("Alice", 1);
        PersonWithoutOverrides p2 = new PersonWithoutOverrides("Bob", 2);
        PersonWithoutOverrides p3 = new PersonWithoutOverrides("Alice", 1); // Logically same as p1!

        badMap.put(p1, "Engineer");
        badMap.put(p2, "Designer");
        badMap.put(p3, "Manager"); // Expected: overwrite p1 ("Engineer" -> "Manager")

        System.out.println("badMap size (Expected 2, Actual: " + badMap.size() + ") -> BUG! Stored as 3 entries.");
        System.out.println("badMap.get(p1): " + badMap.get(p1) + " (Still Engineer, was NOT overwritten!)");
        System.out.println("badMap.get(new PersonWithoutOverrides(\"Alice\", 1)): "
                + badMap.get(new PersonWithoutOverrides("Alice", 1))
                + " (Returns null! Lookup fails because new instance has different memory address)");

        // --- SOLUTION: Class WITH hashCode() and equals() properly overridden ---
        System.out.println("\n--- Solution Demo: WITH hashCode() & equals() overridden ---");
        HashMap<PersonWithOverrides, String> goodMap = new HashMap<>();
        PersonWithOverrides g1 = new PersonWithOverrides("Alice", 1);
        PersonWithOverrides g2 = new PersonWithOverrides("Bob", 2);
        PersonWithOverrides g3 = new PersonWithOverrides("Alice", 1); // Logically same as g1

        goodMap.put(g1, "Engineer");
        goodMap.put(g2, "Designer");
        goodMap.put(g3, "Manager"); // Successfully overwrites g1!

        System.out.println("goodMap size (Expected 2, Actual: " + goodMap.size() + ") -> CORRECT!");
        System.out.println("goodMap.get(g1): " + goodMap.get(g1) + " (Updated to Manager!)");
        System.out.println("goodMap.get(new PersonWithOverrides(\"Alice\", 1)): "
                + goodMap.get(new PersonWithOverrides("Alice", 1))
                + " (Successfully retrieved via value match!)");


        // ====================================================================
        // 10. SUMMARY OF TIME & SPACE COMPLEXITIES
        // ====================================================================
        System.out.println("\n==================================================");
        System.out.println(" 10. OPERATIONAL TIME COMPLEXITY SUMMARY");
        System.out.println("==================================================");
        System.out.printf("%-18s | %-15s | %-25s | %s%n", "Operation", "Average Case", "Worst Case (Treeified)", "Why?");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-18s | %-15s | %-25s | %s%n", "put(K, V)", "O(1)", "O(log n)", "Direct bucket index; Red-Black tree insertion on heavy collision");
        System.out.printf("%-18s | %-15s | %-25s | %s%n", "get(K)", "O(1)", "O(log n)", "Direct index lookup; Red-Black tree search in worst case");
        System.out.printf("%-18s | %-15s | %-25s | %s%n", "remove(K)", "O(1)", "O(log n)", "Lookup mechanism as get() before unlinking node");
        System.out.printf("%-18s | %-15s | %-25s | %s%n", "containsKey(K)", "O(1)", "O(log n)", "Hash lookup same as get()");
        System.out.printf("%-18s | %-15s | %-25s | %s%n", "containsValue(V)", "O(n)", "O(n)", "No hash exists for values; linear scan across all buckets");
        System.out.printf("%-18s | %-15s | %-25s | %s%n", "size() / isEmpty()", "O(1)", "O(1)", "Tracked in an internal count variable; no iteration");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Space Complexity: O(n) to store key-value node entries and internal bucket array.");
    }

    // Helper method simulating custom simpleHash collision
    private static int simpleHash(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c;
        }
        return sum % 10; // Simple modulo generating collision for anagrams like "ABC" & "CBA"
    }

    // Helper method simulating fruit store walkthrough
    private static void simulateFruitInsertion(String fruit, int price, int simulatedIndex) {
        System.out.println("  put(\"" + fruit + "\", " + price + ") -> Hash Code -> Index " + simulatedIndex
                + (simulatedIndex == 14 && fruit.equals("Grape")
                ? " [COLLISION at index 14! Attached to Linked List after Orange]"
                : " [Stored at Bucket " + simulatedIndex + "]"));
    }

    // Class WITHOUT equals() and hashCode() overridden (Demonstrates the bug)
    static class PersonWithoutOverrides {
        private final String name;
        private final int id;

        public PersonWithoutOverrides(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "PersonWithoutOverrides{id=" + id + ", name='" + name + "'}";
        }
    }

    // Class WITH equals() and hashCode() properly overridden (Demonstrates the fix)
    static class PersonWithOverrides {
        private final String name;
        private final int id;

        public PersonWithOverrides(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            PersonWithOverrides other = (PersonWithOverrides) obj;
            return id == other.id && Objects.equals(name, other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id); // Identical hash code if name & id match
        }

        @Override
        public String toString() {
            return "PersonWithOverrides{id=" + id + ", name='" + name + "'}";
        }
    }
}
