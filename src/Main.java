public class Main {
    public static void main(String[] args) {
        (new Thread(new SynchronizedLockObject(1))).start();
        (new Thread(new SynchronizedLockObject(2))).start();
        (new Thread(new SynchronizedLockObject(3))).start();

    }
}