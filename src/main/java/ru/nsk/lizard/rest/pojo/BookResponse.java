package ru.nsk.lizard.rest.pojo;

import java.util.List;

/**
 * Created by dkim on 22.11.2016.
 */
public class BookResponse {
    private final String UID;

    private final List<Slot> failedSlots;

    public BookResponse(String UID, List<Slot> failedSlots) {
        this.UID = UID;
        this.failedSlots = failedSlots;
    }

    public String getUID() {
        return UID;
    }

    public List<Slot> getFailedSlots() {
        return failedSlots;
    }
}
