package CreatThreadByRunnable;

public class Main {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo("ThreadDemo");
        runnableDemo.run();
        runnableDemo.start();
    }
}
