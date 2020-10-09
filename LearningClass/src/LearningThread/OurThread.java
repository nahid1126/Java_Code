package LearningThread;

import static java.lang.Thread.sleep;

public class OurThread extends Thread {

    private String threadName;
    private int startingPoint, counter, adder, timeDifference;
    private OurThread dependentThread;
    private boolean threadAliveFlag;

    //----------------constructor----------
    public OurThread(String threadName, int startingPoint, int adder, int timeDifference, boolean threadAliveFlag, OurThread dependentThread) {
        super();
        this.threadName = threadName;
        this.startingPoint = startingPoint;
        this.adder = adder;
        this.timeDifference = timeDifference;
        this.threadAliveFlag = threadAliveFlag;
        this.dependentThread = dependentThread;

    }


    //-----run() methods-----
    @Override
    public void run() {
        counter = startingPoint;

        if (dependentThread != null) {
            //-------if 1st dependent threads work is finish then add the next threads-------
            try {
                dependentThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (threadAliveFlag) {
            //every time coming to while counter added to adder
            counter += adder;
            try {
                sleep(timeDifference);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //---------stopThreads-----------
    public void stopThread() {
        threadAliveFlag = false;
    }

    //------------getters ans setters---------
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }

    public int getTimeDifference() {
        return timeDifference;
    }

    public void setTimeDifference(int timeDifference) {
        this.timeDifference = timeDifference;
    }

    public boolean isThreadAliveFlag() {
        return threadAliveFlag;
    }

    public void setThreadAliveFlag(boolean threadAliveFlag) {
        this.threadAliveFlag = threadAliveFlag;
    }

}
