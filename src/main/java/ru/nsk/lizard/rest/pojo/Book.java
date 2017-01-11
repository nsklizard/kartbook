package ru.nsk.lizard.rest.pojo;

import java.util.List;

/**
 * Created by dkim on 22.11.2016.
 */
public class Book {
    private final String customerName;

    private final List<Slot> selectedSlots;

    public Book(String customerName, List<Slot> selectedSlots) {
        this.customerName = customerName;
        this.selectedSlots = selectedSlots;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Slot> getSelectedSlots() {
        return selectedSlots;
    }
}
