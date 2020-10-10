package RunnableThreads;

public class CustomRunnableObject implements Runnable {
    //private boolean stopFlag=false;
    private String name;
    private int counter;

    public CustomRunnableObject(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            //do something
            counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                break;
            }
        }
    }
}
