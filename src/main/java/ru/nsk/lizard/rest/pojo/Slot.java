package ru.nsk.lizard.rest.pojo;

import ru.nsk.lizard.enums.SlotStatus;

/**
 * Created by dkim on 22.11.2016.
 */
public class Slot {
    private Long id;
    private String time; //HH:mm
    private int durationMin; //15
    private String kartNumber; //5
    private SlotStatus status;

    public Slot(Long id, String time, int durationMin, String kartNumber, SlotStatus status) {
        this.id = id;
        this.time = time;
        this.durationMin = durationMin;
        this.kartNumber = kartNumber;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public void setKartNumber(String kartNumber) {
        this.kartNumber = kartNumber;
    }

    public void setStatus(SlotStatus status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public String getKartNumber() {
        return kartNumber;
    }

    public SlotStatus getStatus() {
        return status;
    }
}
