package MultiThreadingBasics;

/**
 * Created by ARPITHA RAO on 06-04-2017.
 */
public class Racer implements Runnable{
    /*
     * class that implements Runnable has to override run()
     * start() starts the thread execution from run()
     * thread is just an object
     * JVM invokes thread execution in the backgroud for every main() in every application
     *
     * Thread states:
     * 1. new --> thread is just an object
     * 2. Runnable  --> start() : thread is ready to execute }
     * 3. Running   --> run() : thread is executing          } --> thread is active and alive
     * 4. Sleep     --> sleep() : thread execution paused    }// no guarantee that sleeps immediately and till so long ms//
     * 5. Dead      --> dead() : after run() execution is complete! same thread cannot be start() again!!!
     *
     * Thread Priorities:
     * All threads have normal priority unless specified
     * Priority : 1 - least Thread.MIN_PRIORITY
     *          : 10 - highest Thread.MAX_PRIORITY
     *          : 5 - normal Thread.NORM_PRIORITY
     *          // no guarantee that after t.setPriority() that thread(highest priority) start() running immediately
     *          t.setPriority() should be before start()
     *
     *          Currently executing thread will have higher priority than the thread in pools
     *          Priority is decided by Thread Scheduler.
     *
     *  yeild() --> gives other equal priority threads in the pool chance to execute
     *          --> brings back currently running thread to runnable at most and not to block() or wait()
     *          --> does not guanrantee equal opportunity to other threads or brings running to runnable immediately
     *          --> these all depends on OS, JVM and Thread Scheduler
     *
     *  join()  --> guaranteed that t1(current executing thread) stops and t2.join() executes completely
     *          --> non static
     *
     *  interrupt() --> read about it
     *
     *  Synchronization:
     *
     *  Code Synchronization prevents multiple threads executing simultaneously --> only applicable for methods and blocks of code.
     *  Code Synchronization implemented with Locks
     *  Synchronized thread trying to access that code should acquire lock from the object
     *  Every object has a lock-> one lock only
     *  Every class has a lock-> one lock only
     *
     */

    public static String winner;

    public void race(){
        for(int i = 1; i<=5;i++){
            System.out.println("Distance cover by "+ Thread.currentThread().getName()+" is "+i+"meters.");
            //check if race is won
            boolean isRaceWon = this.isRaceWon(i);
            if(isRaceWon){
                break;
            }
        }
    }

    private boolean isRaceWon(int totalDistanceCovered){
        boolean isRaceWon = false;
        if(Racer.winner==null && totalDistanceCovered==100){
            String winnerName = Thread.currentThread().getName();
            Racer.winner = winnerName;//setting winner name
            System.out.println("Winner is "+Racer.winner);
            isRaceWon = true;
        }
        else if(Racer.winner==null ){
            isRaceWon = false;
        }

        else if(Racer.winner!=null ){
            isRaceWon = true;
        }
        return isRaceWon;
    }

    @Override
    public void run(){
       // this.race();
//        Thread.yield();

        System.out.println(System.nanoTime()+" current thread "+Thread.currentThread().getName()+" beginning");

        if(Thread.currentThread().getName().equals("T1")){
            try{
                System.out.println(System.nanoTime()+" inside the join condition");
                RaceDemo.newThread.start();
                RaceDemo.newThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(System.nanoTime()+" current thread "+Thread.currentThread().getName()+" end");

    }
}
