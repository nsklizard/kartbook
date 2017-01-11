package ru.nsk.lizard.rest.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by dkim on 22.11.2016.
 */
public class Day {
    private final String date; //dd.MM.yyyy
    private final List<Slot> slots;

    public Day(String date, List<Slot> slots) {
        this.date = date;
        this.slots = slots;
    }

    public String getDate() {
        return date;
    }

    public List<Slot> getSlots() {
        return slots;
    }
}
