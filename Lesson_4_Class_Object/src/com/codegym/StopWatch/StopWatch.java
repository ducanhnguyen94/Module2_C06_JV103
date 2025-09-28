package com.codegym.StopWatch;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    
    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public void getElapsedTime() {
        Duration elapsedTime = Duration.between(this.startTime, this.endTime);
        long miliElapsedTime = elapsedTime.toMillis();
        System.out.println("Elapsed Time: " + miliElapsedTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        for (int i = 0; i < 1000000; i++) {
            System.out.print("a");
        }
        stopWatch.stop();
        stopWatch.getElapsedTime();

    }
}
