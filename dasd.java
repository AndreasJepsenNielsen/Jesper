import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class dasd {
    public static Object Lock = new Object();
    // Kapitel 3 opgave 2
    public static void main(String[] args) {



        Thread thread1 = new Thread(new HelloThreadd(),"Kasper");
        Thread thread2 = new Thread(new GoodbyeThread(),"Kasper");
        Thread thread3 = new Thread(new HelloThreadd(),"Matias");
        Thread thread4 = new Thread(new GoodbyeThread(),"Matias");
        Thread thread5 = new Thread(new HelloThreadd(),"Troels");
        Thread thread6 = new Thread(new GoodbyeThread(),"Troels");
        Thread thread7 = new Thread(new HelloThreadd(),"Kasper");
        Thread thread8 = new Thread(new GoodbyeThread(),"Andreas");
        Thread thread9 = new Thread(new HelloThreadd(),"Kasper");
        Thread thread10 = new Thread(new GoodbyeThread(),"Andreas");
        Thread thread11 = new Thread(new HelloThreadd(),"Kasper");
        Thread thread12 = new Thread(new GoodbyeThread(),"Andreas");


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();


    }
}

class HelloThreadd implements Runnable {

    public static ReentrantLock Lock = new ReentrantLock();

    public void run() {

        int pause;
        synchronized (dasd.Lock) {
            for (int i = 1; i <= 3; i++) {
                try {
                    System.out.println(currentThread().getName() + " Has been to the toilet ");

                    pause = (int) (Math.random() * 2000); // giver pause en random værdig op til 3000 millisekunder (3 Sekunder)

                    sleep(pause);
                } catch (InterruptedException interruptEx) {
                    System.out.println(interruptEx);
                }

            }
        }
        System.out.println(Thread.currentThread().getName() + " Is finished using the toilet for today");
    }
}

class GoodbyeThread implements Runnable {





    int pause;
    public void run () {
        synchronized (dasd.Lock) {
            for (int i = 1; i <= 3; i++) {
                try {
                    System.out.println(currentThread().getName() + " Has bought something in the cantina " + " ||" + " Times run = " + i);
                    pause = (int) (Math.random() * 2000);  // giver pause en random værdig op til 3000 millisekunder (3 Sekunder)

                    sleep(pause);
                } catch (InterruptedException interruptEx) {
                    System.out.println(interruptEx);
                }
            }
        }


        System.out.println(Thread.currentThread().getName() + "Has gone home for today and wont be buying anymore from the cantina");
    }

}

class Toilet {
    public static Object Lock = new Object();

    public static void getToToilet() {
        System.out.println(Thread.currentThread().getName() + "Is on the toilet");
    }
}