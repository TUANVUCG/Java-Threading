package RacingCar;

import java.util.Random;

public class Car implements Runnable{
    private final  int DISTANCE = 100;
    private final int STEP = 2;
    private String nameCar;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long starTime = System.currentTimeMillis();

        while(runDistance<DISTANCE){
            try{
                int speed = (new Random().nextInt(5));

                runDistance +=speed;

                String log = "|";

                int percentTravel = (runDistance*100)/DISTANCE;
                for(int i = 0;i<DISTANCE; i+= STEP){
                    if(percentTravel>=i+STEP){
                        log+="=";
                    }
                    else if(percentTravel>=i&&percentTravel<i+STEP){
                        log +="o";
                    }
                    else {
                        log += "-";
                    }
                }
                log+="|";
                System.out.println("Car "+this.nameCar+" : "+log +" "+Math.min(DISTANCE,runDistance)+"KM");
            }catch (Exception e){
                System.out.println("Car "+this.nameCar+" broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car "+ this.nameCar+" Finish in "+(endTime-starTime)+"ms");
    }
}
