public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED + "Hello from runnable's thread");
    }
}
