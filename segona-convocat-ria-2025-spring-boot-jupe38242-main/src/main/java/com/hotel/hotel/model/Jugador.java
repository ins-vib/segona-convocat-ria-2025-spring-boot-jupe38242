package com.hotel.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugadors")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String posicio;

    @ManyToOne
    @JoinColumn(name = "id_equip")
    private Equip equips;


    //Constructors
    public Jugador(Long id, String nom, String posicio, Equip equips) {
        this.id = id;
        this.nom = nom;
        this.posicio = posicio;
        this.equips = equips;
    }

    public Jugador() {
    }

    //Setters & Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }

    public Equip getEquips() {
        return equips;
    }

    public void setEquips(Equip equips) {
        this.equips = equips;
    }
}
