import java.util.ArrayList;
import java.util.Vector;

/**
 * ThreadSafetyDemo.java
 *
 * Demonstrates the difference between ArrayList (NOT thread-safe)
 * and Vector (thread-safe) in a multi-threaded scenario.
 *
 * Scenario:
 *   - 2 threads each add 1000 elements to the same list
 *   - Expected final size = 2000
 *   - ArrayList: may result in < 2000 due to race conditions
 *   - Vector:    always results in exactly 2000 (synchronized methods)
 */
public class ThreadSafetyDemo {

    // Number of threads and adds per thread
    static final int THREADS      = 2;
    static final int ADDS_EACH    = 1000;
    static final int EXPECTED     = THREADS * ADDS_EACH; // 2000

    public static void main(String[] args) throws InterruptedException {

        System.out.println("============================================");
        System.out.println("  Thread Safety Demo: ArrayList vs Vector   ");
        System.out.println("============================================");
        System.out.println("  Threads: " + THREADS + " | Adds per thread: " + ADDS_EACH);
        System.out.println("  Expected final size: " + EXPECTED);
        System.out.println("============================================\n");

        // ─────────────────────────────────────────────
        // TEST 1: ArrayList — NOT Thread-Safe
        // ─────────────────────────────────────────────
        System.out.println("----- ArrayList (Not Thread-Safe) -----");

        ArrayList<Integer> arrayList = new ArrayList<>();

        /*
         * WHY ArrayList is NOT thread-safe:
         *   ArrayList.add() is NOT synchronized.
         *   When two threads call add() at the same time:
         *     → Both may read the same 'size' value
         *     → Both write to the same index → one write is LOST
         *     → OR an ArrayIndexOutOfBoundsException may occur internally
         *   Result: final size < 2000 (data lost) or even an exception
         */
        Thread alThread1 = new Thread(() -> {
            for (int i = 0; i < ADDS_EACH; i++) {
                arrayList.add(i);
            }
        }, "AL-Thread-1");

        Thread alThread2 = new Thread(() -> {
            for (int i = 0; i < ADDS_EACH; i++) {
                arrayList.add(i);
            }
        }, "AL-Thread-2");

        alThread1.start();
        alThread2.start();
        alThread1.join();  // wait for thread 1 to finish
        alThread2.join();  // wait for thread 2 to finish

        int alSize = arrayList.size();
        System.out.println("[ArrayList] Expected : " + EXPECTED);
        System.out.println("[ArrayList] Actual   : " + alSize);
        if (alSize == EXPECTED) {
            // This can happen but is NOT guaranteed — race condition is non-deterministic
            System.out.println("[ArrayList] Result   : ⚠️  Got " + EXPECTED + " this time, but NOT guaranteed!");
        } else {
            System.out.println("[ArrayList] Result   : ❌ Data inconsistency! Lost " + (EXPECTED - alSize) + " elements due to race condition.");
        }

        // ─────────────────────────────────────────────
        // TEST 2: Vector — Thread-Safe
        // ─────────────────────────────────────────────
        System.out.println("\n----- Vector (Thread-Safe) -----");

        Vector<Integer> vector = new Vector<>();

        /*
         * WHY Vector IS thread-safe:
         *   Vector.add() is declared as 'synchronized'.
         *   The JVM uses an internal lock (monitor) on the Vector object.
         *   Only ONE thread can execute add() at a time → no data loss.
         *   Result: final size is ALWAYS exactly 2000
         *
         * Trade-off:
         *   The synchronization lock adds overhead.
         *   In single-threaded apps, Vector is SLOWER than ArrayList.
         */
        Thread vThread1 = new Thread(() -> {
            for (int i = 0; i < ADDS_EACH; i++) {
                vector.add(i);
            }
        }, "V-Thread-1");

        Thread vThread2 = new Thread(() -> {
            for (int i = 0; i < ADDS_EACH; i++) {
                vector.add(i);
            }
        }, "V-Thread-2");

        vThread1.start();
        vThread2.start();
        vThread1.join();
        vThread2.join();

        int vSize = vector.size();
        System.out.println("[Vector]    Expected : " + EXPECTED);
        System.out.println("[Vector]    Actual   : " + vSize);
        if (vSize == EXPECTED) {
            System.out.println("[Vector]    Result   : ✅ Always thread-safe! All " + EXPECTED + " elements preserved.");
        } else {
            System.out.println("[Vector]    Result   : ❌ Unexpected error.");
        }

        // ─────────────────────────────────────────────
        // SUMMARY
        // ─────────────────────────────────────────────
        System.out.println("\n============================================");
        System.out.println("                  SUMMARY                  ");
        System.out.println("============================================");
        System.out.printf("  %-15s %-10s %-10s %-15s%n", "Collection", "Expected", "Actual", "Thread-Safe?");
        System.out.println("  ---------------------------------------------------");
        System.out.printf("  %-15s %-10d %-10d %-15s%n",
                "ArrayList",  EXPECTED, alSize, alSize == EXPECTED ? "⚠️  Maybe" : "❌ No");
        System.out.printf("  %-15s %-10d %-10d %-15s%n",
                "Vector",     EXPECTED, vSize,  vSize  == EXPECTED ? "✅ Yes"   : "❌ No");
        System.out.println("============================================");
        System.out.println();
        System.out.println("💡 Key Takeaway:");
        System.out.println("   → ArrayList: Fast, but NOT safe for concurrent use.");
        System.out.println("   → Vector:    Slower (due to sync overhead), but ALWAYS thread-safe.");
        System.out.println("   → Modern alternative for thread-safety:");
        System.out.println("       CopyOnWriteArrayList  (java.util.concurrent)");
        System.out.println("       Collections.synchronizedList(new ArrayList<>())");
    }
}
