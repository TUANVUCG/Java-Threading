package CountNumber;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();

        try{
            while(count.getMyThread().isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
