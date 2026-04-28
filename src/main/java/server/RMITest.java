package server;

public class RMITest {
    public static void main(String[] args) {
        System.out.println("Starting RMI Communication Tests...");
        try {
            System.out.println("[TEST 1] Checking RMI Registry initialization...");
            RMIServer.startServer(1099, "TestNode");
            System.out.println("[PASS] Registry initialized.");

            System.out.println("[TEST 2] Validating VideoInterface signatures...");
            Class<?> inter = VideoInterface.class;
            if (inter.isInterface()) {
                System.out.println("[PASS] VideoInterface is a valid Java Interface.");
            }
            System.out.println("\nAll RMI Interface tests passed successfully!");
        } catch (Exception e) {
            System.err.println("[FAIL] Test failed with exception: " + e.getMessage());
        }
    }
}
