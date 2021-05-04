package CreatSimpleThread;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main running");
        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator1);


        NumberGenerator numberGenerator2 = new NumberGenerator();
        Thread thread2 = new Thread(numberGenerator2);


        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();


    }
}
