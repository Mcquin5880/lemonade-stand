package com.cooksys.lemonadestand.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Lemonade {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int iceCubes;

    @Column(nullable = false)
    private double lemonJuice;

    @Column(nullable = false)
    private double water;

    @Column(nullable = false)
    private double sugar;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn
    private Order order;

}
