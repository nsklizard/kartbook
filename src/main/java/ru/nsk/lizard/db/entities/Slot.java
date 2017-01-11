package ru.nsk.lizard.db.entities;

import ru.nsk.lizard.enums.SlotStatus;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dkim on 21.11.2016.
 */
@Entity
@Table(name="slots")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="slots_id_seq")
    @SequenceGenerator(name="slots_id_seq", sequenceName="slots_id_seq", allocationSize=1)
    private Long id;

    @Column
    private Date startDate;

    @Column
    private Long durationMS;

    @Column
    private SlotStatus status;

    @Column
    private String bookUID;

    @ManyToOne
    @JoinColumn(name = "kartId")
    private Kart kart;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getDurationMS() {
        return durationMS;
    }

    public void setDurationMS(Long durationMS) {
        this.durationMS = durationMS;
    }

    public SlotStatus getStatus() {
        return status;
    }

    public void setStatus(SlotStatus status) {
        this.status = status;
    }

    public Kart getKart() {
        return kart;
    }

    public void setKart(Kart kart) {
        this.kart = kart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
