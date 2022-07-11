package org.example.models.entities;

import java.util.Date;

public class Timer {
    Date presentTime;
    Date futureTime;

    public Timer(Date presentTime, Date futureTime) {
        this.presentTime = presentTime;
        this.futureTime = futureTime;
    }

    public Date getFutureTime() {
        return futureTime;
    }

    public void setFutureTime(Date futureTime) {
        this.futureTime = futureTime;
    }
}
