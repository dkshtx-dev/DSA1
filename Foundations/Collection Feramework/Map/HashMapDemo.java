import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        // 1. Creation
        HashMap<Integer, String> map = new HashMap<>();
        // Note: Can also define initial capacity & load factor:
        // HashMap<Integer, String> customMap = new HashMap<>(17, 0.5f);

        // 2. put(key, value) & Key Uniqueness
        map.put(31, "Shubham");
        map.put(11, "Akshit");
        map.put(2, "Neha");
        map.put(2, "Mehul"); // Overwrites "Neha" because keys must be unique
        System.out.println("After put(): " + map);

        // 3. get(key) & null for missing keys
        String student = map.get(31);
        System.out.println("get(31): " + student);
        String s = map.get(69);
        System.out.println("get(69): " + s); // returns null because key doesn't exist

        // 4. containsKey() & containsValue()
        System.out.println("containsKey(2): " + map.containsKey(2));           // O(1)
        System.out.println("containsValue(Shubham): " + map.containsValue("Shubham")); // O(n)

        // 5. keySet() Iteration
        System.out.println("\nIteration using keySet():");
        for (int i : map.keySet()) {
            System.out.println("Key: " + i + " -> Value: " + map.get(i));
        }

        // 6. entrySet() Iteration (Memory-efficient + In-place modification)
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println("\nAfter entrySet() uppercase: " + map);

        // 7. remove() - Conditional vs Normal
        // map.remove(31);
        boolean res = map.remove(31, "Nitin"); // false (value doesn't match)
        System.out.println("REMOVED (31, Nitin)? : " + res);
        map.remove(31); // removes key 31
        System.out.println("After remove(31): " + map);

        // 8. Performance Comparison: List O(n) vs HashMap O(1)
        List<Integer> list = Arrays.asList(2, 4, 32, 43, 4, 432);
        System.out.println("\nlist.contains(32): " + list.contains(32) + " -> O(n) linear search");
        System.out.println("map.containsKey(2): " + map.containsKey(2) + " -> O(1) hash lookup");

        // 9. Handling Null Keys & Null Values
        map.put(null, "DefaultStudent"); // Exactly 1 null key allowed (stored at bucket 0)
        map.put(99, null);               // Multiple null values allowed
        System.out.println("\nWith null key & value: " + map);

        // 10. Internal Index Calculation: (n - 1) & hash
        // hash = key.hashCode() ^ (key.hashCode() >>> 16)
        int key = 11;
        int h = Integer.valueOf(key).hashCode();
        int hash = h ^ (h >>> 16);
        int index = (16 - 1) & hash; // Capacity n = 16
        System.out.println("\nInternal bucket index for key 11: " + index);

        // 11. Collisions & Java 8 Red-Black Tree
        // When different keys produce the same bucket index -> stored as a Linked List.
        // If a bucket gets >= 8 entries (TREEIFY_THRESHOLD), it converts to a
        // Red-Black Tree, improving lookup from O(n) to O(log n).

        // 12. Load Factor & Rehashing
        // Default capacity = 16, load factor = 0.75 -> threshold = 12 (16 * 0.75).
        // When 13th element is added, capacity doubles (16 -> 32) and entries are rehashed.

        // 13. Custom Class as Key: equals() & hashCode()
        // Without overriding, two objects with same data fail lookup (return null).
        HashMap<Student, String> studentMap = new HashMap<>();
        studentMap.put(new Student(101, "Aarav"), "Computer Science");
        System.out.println("\nCustom Key lookup with new Student(101, Aarav): "
                + studentMap.get(new Student(101, "Aarav"))); // Success because equals/hashCode overridden!

        // 14. Complexity Summary
        // put(), get(), remove(), containsKey() : O(1) average, O(log n) worst case (tree)
        // containsValue()                       : O(n)
        // Space Complexity                      : O(n)
    }

    // Simple Student class demonstrating equals() and hashCode() contract
    static class Student {
        private final int id;
        private final String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }
    }
}
