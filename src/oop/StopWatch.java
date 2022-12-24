package oop;

public class StopWatch {
    private long startTime,endTime;

    public long getStartTime(){
        return startTime;
    }
    void setStartTime(long startTime){
        this.startTime=startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    void setEndTime(long endTime){
        this.endTime=endTime;
    }

    StopWatch(){
        this.startTime=  System.currentTimeMillis();
    }
    void start(){
        this.setStartTime(System.currentTimeMillis());
    }
    void stop(){
        this.setEndTime(System.currentTimeMillis());
    }
    long getElapsedTime(){
        return this.getEndTime()-this.getStartTime();
    }

    public static void main(String[] args) {
        StopWatch x = new StopWatch();
        x.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        x.stop();
        System.out.println("The Elapsed time is: " + x.getElapsedTime() + " milisec");
    }

}
