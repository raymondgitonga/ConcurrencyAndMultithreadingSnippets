public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello From The Main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        Thread newThread = new Thread(()-> System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous thread"));
        newThread.start();
    }
}
