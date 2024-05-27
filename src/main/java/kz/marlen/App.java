package kz.marlen;

public class App {
    public static void main(String[] args) {
        SingleThread singleThread = new SingleThread();
        MultiThreads multiThreads = new MultiThreads();

        System.out.println("SingleThread");
        singleThread.process();

        System.out.println("MultiThread");
        multiThreads.process();
    }
}

