package MultiThreadingBasics;

/**
 * Created by ARPITHA RAO on 06-04-2017.
 */
public class RaceDemo {

    public static Thread newThread;

    public static void main(String args[]) {
        Racer racer = new Racer();
        Thread tortoise = new Thread((Runnable) racer, "Tortoise");
        Thread hare = new Thread((Runnable) racer, "Hare");
        //Start the race or this application or this thread in this process
        /*tortoise.start();
        hare.start();
        try {
            hare.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        newThread = new Thread(racer, "secondThread");
        ThreadGroup tg = new ThreadGroup("ThreadGroup");

        Thread t1 = new Thread(tg, racer, "T1");
        Thread t2 = new Thread(tg, racer, "T2");
        Thread t3 = new Thread(tg, racer, "T3");
        Thread t4 = new Thread(tg, racer, "T4");
        Thread t5 = new Thread(tg, racer, "T5");
        Thread t6 = new Thread(tg, racer, "T6");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);

        t5.setPriority(Thread.MIN_PRIORITY);
        t6.setPriority(Thread.MIN_PRIORITY);

        t1.start();
     /*   t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();*/

        while (true){
            Thread.State t1State = t1.getState();
            Thread.State t2State = t2.getState();
            Thread.State t3State = t3.getState();
            Thread.State t4State = t4.getState();
            Thread.State t5State = t5.getState();
            Thread.State t6State = t6.getState();

          /*  System.out.println(System.nanoTime()+" t1 status "+t1State);
            System.out.println(System.nanoTime()+" t2 status "+t2State);
            System.out.println(System.nanoTime()+" t3 status "+t3State);
            System.out.println(System.nanoTime()+" t4 status "+t4State);
            System.out.println(System.nanoTime()+" t5 status "+t5State);
            System.out.println(System.nanoTime()+" t6 status "+t6State);*/

            int active = tg.activeCount();
            if(active == 0){
                break;
            }
        }
    }
}
