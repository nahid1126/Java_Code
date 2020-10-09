package LearningThread;

import java.util.Scanner;

public abstract class LearningThread {
    //---------create scanner----------
    static Scanner myScanner = new Scanner(System.in);
    //-------creating threads----------
    private static OurThread thread1 = new OurThread("child 1", 0, 1, 500, true, null);
    private static OurThread thread2 = new OurThread("child 2", 100, 10, 1000, true, thread1);
    private static OurThread thread3 = new OurThread("child 3", 1000, 100, 2000, true, thread2);

    public static void main(String[] args) {

        //-----------start threads-----------
        thread1.start();
        thread2.start();
        thread3.start();

        //---------------input the command by user------------
        System.out.println("please write a command ");
        String commandString = myScanner.nextLine();

        //-----------counter the threads and stop--------------
        while (!commandString.toLowerCase().equals("exit")) {
            if (commandString.equals("1")) {
                System.out.println("counter in thread 1 :" + thread1.getCounter());
                threadStatus();
            } else if (commandString.equals("2")) {
                System.out.println("counter in thread 2 :" + thread2.getCounter());
                threadStatus();
            } else if (commandString.equals("3")) {
                System.out.println("counter in thread 3 :" + thread3.getCounter());
                threadStatus();
            } else if (commandString.toLowerCase().equals("1s")) {
                thread1.stopThread();
                System.out.println("Thread 1 stopped");
                threadStatus();
            } else if (commandString.toLowerCase().equals("2s")) {
                thread2.stopThread();
                System.out.println("Thread 2 stopped");
                threadStatus();
            } else if (commandString.toLowerCase().equals("3s")) {
                thread3.stopThread();
                System.out.println("Thread 3 stopped");
                threadStatus();
            } else {
                System.out.println("Please Enter a proper command");
            }
            commandString = myScanner.nextLine();
        }
    }

    //-------------check threads are alive or not-----------------
    private static void threadStatus() {
        System.out.println("Thread 1 is alive :" + thread1.isAlive());
        System.out.println("Thread 2 is alive :" + thread2.isAlive());
        System.out.println("Thread 3 is alive :" + thread3.isAlive());
    }

}
