public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello From The Main Thread");

//        threadBasics();

        CountDown countDown = new CountDown();
        CountDownThread t1 = new CountDownThread(countDown);
        t1.setName("Thread 1");

        CountDownThread t2 = new CountDownThread(countDown);
        t1.setName("Thread 2");

        t1.start();
        t2.start();


    }

    public static void threadBasics() {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello From The Main Thread");

        // Thread class
        Thread anotherThread = new AnotherThread();
        anotherThread.setName(" == Another Thread == ");
        anotherThread.start();
        anotherThread.interrupt();

        Thread newThread = new Thread(() -> System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous thread"));
        newThread.start();

        Thread runnable = new Thread(new Runnable());
        runnable.start();

        Thread anotherRunnable = new Thread(() -> {
            System.out.println(ThreadColor.ANSI_CYAN + "Hello from an anonymous runnable");
            try {
                anotherThread.join();
                System.out.println(ThreadColor.ANSI_RED + "Another thread terminated so i'm running again");
            } catch (InterruptedException e) {
                System.out.println(ThreadColor.ANSI_RED + "I couldn't wait i was interrupted");
            }
        });
        anotherRunnable.start();
    }
}
