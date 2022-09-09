package C07_09092022.StopWatch;

import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public void start(){
        startTime = LocalDateTime.now();
    }
    public void end(){
        endTime = LocalDateTime.now();
    }
    public int getElapsedTime(){
        return endTime.getSecond() - startTime.getSecond();
    }

    @Override
    public String toString() {
        return "startTime=" + startTime +
                ", endTime=" + endTime ;
    }

}
