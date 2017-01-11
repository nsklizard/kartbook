package ru.nsk.lizard.db.entities;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by dkim on 21.11.2016.
 */
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="customers_id_seq")
    @SequenceGenerator(name="customers_id_seq", sequenceName="customers_id_seq", allocationSize=1)
    private Long id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @OneToMany
    private Set<Slot> paidSlots;

    @OneToMany
    private Set<Slot> bookedSlots;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Slot> getPaidSlots() {
        return paidSlots;
    }

    public void setPaidSlots(Set<Slot> paidSlots) {
        this.paidSlots = paidSlots;
    }

    public Set<Slot> getBookedSlots() {
        return bookedSlots;
    }

    public void setBookedSlots(Set<Slot> bookedSlots) {
        this.bookedSlots = bookedSlots;
    }
}
