public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello From The Main Thread");

        // Thread class
        Thread anotherThread = new AnotherThread();
        anotherThread.setName(" == Another Thread == ");
        anotherThread.start();

        Thread newThread = new Thread(()-> System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous thread"));
        newThread.start();

        Thread runnable = new Thread(new Runnable());
        runnable.start();

        Thread anotherRunnable = new Thread(() -> System.out.println(ThreadColor.ANSI_CYAN + "Hello from an anonymous runnable" ));
        anotherRunnable.start();


    }
}
