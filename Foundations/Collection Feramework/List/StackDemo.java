import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;

public class StackDemo {
    public static void main(String[] args) {

        // ==================== Creation ====================
        System.out.println("===== Stack Creation =====");

        // Stack<Integer> v1 = new Stack<>();  → default empty stack
        Stack<Integer> v1 = new Stack<>();
        System.out.println("New empty Stack<Integer>: " + v1);
        System.out.println("isEmpty(): " + v1.isEmpty());

        // ==================== push() ====================
        System.out.println("\n===== push(E e) — Add to Top =====");

        /*
         * push(E e):
         *   → Adds the element to the TOP of the stack
         *   → LIFO: the last element pushed will be the first one popped
         *
         * Stack visualized (bottom → top):
         *   [10, 20, 30, 40, 50]  ← 50 is on top
         */
        Stack<Integer> v2 = new Stack<>();
        v2.push(10);
        v2.push(20);
        v2.push(30);
        v2.push(40);
        v2.push(50);
        System.out.println("After push(10..50): " + v2);
        // TOP → 50, then 40, 30, 20, 10 ← BOTTOM

        // ==================== peek() ====================
        System.out.println("\n===== peek() — Look at Top WITHOUT Removing =====");

        /*
         * peek():
         *   → Returns the element at the TOP of the stack
         *   → Does NOT remove it
         *   → Throws EmptyStackException if stack is empty
         */
        Stack<Integer> v3 = new Stack<>();
        v3.push(100);
        v3.push(200);
        v3.push(300);
        System.out.println("Stack: " + v3);
        System.out.println("peek(): " + v3.peek());         // 300 (top)
        System.out.println("Stack after peek(): " + v3);    // unchanged — [100, 200, 300]

        // ==================== pop() ====================
        System.out.println("\n===== pop() — Remove from Top =====");

        /*
         * pop():
         *   → Removes AND returns the element at the TOP of the stack
         *   → LIFO in action: last pushed = first popped
         *   → Throws EmptyStackException if stack is empty
         */
        Stack<Integer> v4 = new Stack<>();
        v4.push(5);
        v4.push(10);
        v4.push(15);
        v4.push(20);
        System.out.println("Stack: " + v4);
        System.out.println("pop(): " + v4.pop());           // 20
        System.out.println("pop(): " + v4.pop());           // 15
        System.out.println("Stack after 2 pops: " + v4);   // [5, 10]

        // ==================== size() & isEmpty() ====================
        System.out.println("\n===== size() & isEmpty() =====");

        Stack<Integer> v5 = new Stack<>();
        v5.push(1);
        v5.push(2);
        v5.push(3);
        System.out.println("Stack: " + v5);
        System.out.println("size(): " + v5.size());         // 3
        System.out.println("isEmpty(): " + v5.isEmpty());   // false

        v5.pop(); v5.pop(); v5.pop();                        // empty the stack
        System.out.println("After popping all: " + v5);
        System.out.println("isEmpty(): " + v5.isEmpty());   // true

        // ==================== search() ====================
        System.out.println("\n===== search(Object o) — 1-Based Index from Top =====");

        /*
         * search(Object o):
         *   → Returns POSITION of element from the TOP (1-based index)
         *       position 1 = top element
         *       position 2 = one below top, etc.
         *   → Returns -1 if element NOT found
         *
         * ⚠️ NOTE: 1-based from TOP — NOT 0-based from bottom!
         */
        Stack<Integer> v6 = new Stack<>();
        v6.push(10);   // bottom
        v6.push(20);
        v6.push(30);
        v6.push(40);   // top
        System.out.println("Stack (bottom→top): " + v6);
        // Index from top: 40=1, 30=2, 20=3, 10=4

        System.out.println("search(40): " + v6.search(40));  // 1  (top)
        System.out.println("search(30): " + v6.search(30));  // 2
        System.out.println("search(20): " + v6.search(20));  // 3
        System.out.println("search(10): " + v6.search(10));  // 4  (bottom)
        System.out.println("search(99): " + v6.search(99));  // -1 (not found)

        // ==================== Stack extends Vector ====================
        System.out.println("\n===== Stack extends Vector (inherited methods) =====");

        /*
         * Since Stack extends Vector, it inherits ALL Vector methods.
         * You CAN use get(index), but it's BAD PRACTICE for a stack because:
         *   → It breaks LIFO semantics
         *   → Makes code harder to read
         * ✅ Always prefer push/pop/peek for stack operations.
         */
        Stack<Integer> v7 = new Stack<>();
        v7.push(10);
        v7.push(20);
        v7.push(30);
        System.out.println("Stack: " + v7);
        System.out.println("get(0) - bottom (Vector method): " + v7.get(0));  // 10
        System.out.println("get(2) - top    (Vector method): " + v7.get(2));  // 30
        // ⚠️ Prefer peek() over get(size-1) for clarity!

        // ==================== Alternatives to Stack Class ====================
        System.out.println("\n========================================");
        System.out.println("===== Alternatives to Stack Class  =====");
        System.out.println("========================================");

        // ─────────────────────────────────────────────
        // ALT 1: LinkedList as Stack ✅ (Recommended)
        // ─────────────────────────────────────────────
        System.out.println("\n--- LinkedList as Stack (Recommended) ---");

        /*
         * LinkedList implements Deque interface, so it has:
         *   addLast()    → push (add to top = end of list)
         *   removeLast() → pop  (remove from top)
         *   getLast()    → peek (look at top)
         *
         * ✅ Not synchronized → faster in single-threaded use
         * ✅ Preferred in modern Java for stack operations
         */
        LinkedList<Integer> llStack = new LinkedList<>();
        llStack.addLast(1);
        llStack.addLast(2);
        llStack.addLast(3);
        System.out.println("After addLast (push): " + llStack);
        System.out.println("getLast() (peek):     " + llStack.getLast());
        System.out.println("removeLast() (pop):   " + llStack.removeLast());
        System.out.println("After removeLast:      " + llStack);

        // Using Deque-style push/pop/peek on LinkedList
        System.out.println("\n  [LinkedList with Deque-style push/pop/peek]");
        LinkedList<Integer> dequeStack = new LinkedList<>();
        dequeStack.push(100);  // addFirst (top = front in Deque style)
        dequeStack.push(200);
        dequeStack.push(300);
        System.out.println("  After push(100, 200, 300): " + dequeStack);
        System.out.println("  peek(): " + dequeStack.peek());   // 300
        System.out.println("  pop():  " + dequeStack.pop());    // 300
        System.out.println("  After pop: " + dequeStack);

        // ─────────────────────────────────────────────
        // ALT 2: ArrayList as Stack ⚠️ (Not Recommended)
        // ─────────────────────────────────────────────
        System.out.println("\n--- ArrayList as Stack (Not Recommended) ---");

        /*
         * ArrayList CAN work as a stack:
         *   add()             → push (add to end = top)
         *   remove(size - 1)  → pop  (remove from end = top)
         *   get(size - 1)     → peek (look at end = top)
         *
         * ❌ NOT recommended for production code because:
         *   → No dedicated push/pop/peek methods → harder to read
         *   → Reader cannot immediately tell it's being used as a stack
         */
        ArrayList<Integer> alStack = new ArrayList<>();
        alStack.add(10);                                   // push
        alStack.add(20);                                   // push
        alStack.add(30);                                   // push
        System.out.println("After add() (push): " + alStack);

        // peek = get last element
        System.out.println("get(size-1) (peek): " + alStack.get(alStack.size() - 1));  // 30

        // pop = remove last element
        Integer popped = alStack.remove(alStack.size() - 1);
        System.out.println("remove(size-1) (pop): " + popped);                         // 30
        System.out.println("After remove (pop): " + alStack);

        // ==================== Summary ====================
        System.out.println("\n============================================");
        System.out.println("              SUMMARY                       ");
        System.out.println("============================================");
        System.out.printf("  %-18s %-12s %-12s %-15s%n", "Class", "Thread-Safe", "push/pop", "Recommended?");
        System.out.println("  -------------------------------------------------------");
        System.out.printf("  %-18s %-12s %-12s %-15s%n", "Stack",      "✅ Yes", "✅ Yes", "⚠️  Legacy");
        System.out.printf("  %-18s %-12s %-12s %-15s%n", "LinkedList", "❌ No",  "✅ Yes", "✅ Modern choice");
        System.out.printf("  %-18s %-12s %-12s %-15s%n", "ArrayList",  "❌ No",  "❌ No",  "❌ Avoid");
        System.out.println("============================================");
        System.out.println();
        System.out.println("💡 Key Takeaway:");
        System.out.println("   → Stack (LIFO): Last pushed = First popped");
        System.out.println("   → Java Stack class is thread-safe (extends Vector)");
        System.out.println("   → search() is 1-based from TOP (not 0-based from bottom)");
        System.out.println("   → Modern Java prefers LinkedList or ArrayDeque over Stack");
    }
}
