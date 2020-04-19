public class Main {
    public static void main(String[] args) {
        System.out.println("Hello From The Main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        Thread newThread = new Thread(()-> System.out.println("Hello from the anonymous thread"));
        newThread.start();
    }
}
