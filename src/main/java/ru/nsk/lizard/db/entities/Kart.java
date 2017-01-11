package ru.nsk.lizard.db.entities;


import javax.persistence.*;

/**
 * Created by dkim on 21.11.2016.
 */
@Entity
@Table(name = "karts")
public class Kart {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="karts_id_seq")
    @SequenceGenerator(name="karts_id_seq", sequenceName="karts_id_seq", allocationSize=1)
    private Long id;

    @Column
    private String name;
    @Column
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
