package RunnableThreads;

import java.util.Scanner;

public class RunnableThread {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //-----------create customRunnableObject-------------
        CustomRunnableObject firstObject = new CustomRunnableObject("FIRST", 0);
        CustomRunnableObject secondObject = new CustomRunnableObject("SECOND", 200);
        CustomRunnableObject thirdObject = new CustomRunnableObject("THIRD", 100000);
        // CustomRunnableObject fourthObject = new CustomRunnableObject("FOURTH", 5000);


        //-------create threads objects----------
        Thread firstThread = new Thread(firstObject);
        Thread secondThread = new Thread(secondObject);
        Thread thirdThread = new Thread(thirdObject);
        Thread fourthThread = new Thread(firstObject);

        //-----------start threads------------
        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();

        //---------------input the command by user------------
        System.out.println("please write a command ");
        String commandString = scanner.nextLine();

        //-----------counter the threads and stop--------------
        while (!commandString.toLowerCase().equals("exit")) {
            if (commandString.equals("1")) {
                System.out.println("counter in thread 1 :" + firstObject.getCounter());
                //threadStatus();
            } else if (commandString.equals("2")) {
                System.out.println("counter in thread 2 :" + secondObject.getCounter());
                //threadStatus();
            } else if (commandString.equals("3")) {
                System.out.println("counter in thread 3 :" + thirdObject.getCounter());
                //threadStatus();
            } else if (commandString.equals("4")) {
                System.out.println("counter in thread 4 :" + firstObject.getCounter());
                //threadStatus();
            } else if (commandString.toLowerCase().equals("1s")) {
                firstThread.interrupt();
                System.out.println("Thread 1 stopped");
                //threadStatus();
            } else if (commandString.toLowerCase().equals("2s")) {
                secondThread.interrupt();
                System.out.println("Thread 2 stopped");
                //threadStatus();
            } else if (commandString.toLowerCase().equals("3s")) {
                thirdThread.interrupt();
                System.out.println("Thread 3 stopped");
                //threadStatus();
            } else if (commandString.toLowerCase().equals("4s")) {
                fourthThread.interrupt();
                System.out.println("Thread 3 stopped");
                //threadStatus();
            } else {
                System.out.println("Please Enter a proper command");
            }
            commandString = scanner.nextLine();
        }
    }
}
