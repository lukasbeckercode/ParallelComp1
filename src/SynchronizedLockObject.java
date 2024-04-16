public class SynchronizedLockObject implements Runnable{

    private static final Object lockObject = new Object();
    static int count = 0;
    int threadNum;

    SynchronizedLockObject(int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        while (count<1000){
            synchronized (lockObject){
                System.out.println("SynchronizedLockObject Thread " + threadNum +": " + ++count);
            }
            try {
                Thread.sleep(1);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
