package com.childrenFirstBE.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "card")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "page")
    private String page;

    @Column(name = "card")
    private String card;

    @Column(name = "entered", nullable = false)
    private String entered = TimeEntered.getCurrentTimeUsingCalendar();

    @Column(name = "enterexit")
    private String enterexit;
}

