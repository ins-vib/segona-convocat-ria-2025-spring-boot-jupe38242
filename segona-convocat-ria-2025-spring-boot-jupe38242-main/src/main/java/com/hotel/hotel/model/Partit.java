package com.hotel.hotel.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "partits")
public class Partit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_equipLocal")
    private Equip equipLocal;

    @OneToOne
    @JoinColumn(name = "id_equipVisitant")
    private Equip equipsVisitant;

    private LocalDate data;

    private int golsLocal;
    private int golsVisitant;

    private int resultatsLocal;
    private int resultatsVisitant;



    //Constructor
    public Partit() {
    }

    public Partit(Long id, Equip equipLocal, Equip equipsVisitant, LocalDate data, int golsLocal, int golsVisitant,
            int resultatsLocal, int resultatsVisitant) {
        this.id = id;
        this.equipLocal = equipLocal;
        this.equipsVisitant = equipsVisitant;
        this.data = data;
        this.golsLocal = golsLocal;
        this.golsVisitant = golsVisitant;
        this.resultatsLocal = resultatsLocal;
        this.resultatsVisitant = resultatsVisitant;
    }


    //Setters & Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equip getEquipLocal() {
        return equipLocal;
    }

    public void setEquipLocal(Equip equipLocal) {
        this.equipLocal = equipLocal;
    }

    public Equip getEquipsVisitant() {
        return equipsVisitant;
    }

    public void setEquipsVisitant(Equip equipsVisitant) {
        this.equipsVisitant = equipsVisitant;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getGolsLocal() {
        return golsLocal;
    }

    public void setGolsLocal(int golsLocal) {
        this.golsLocal = golsLocal;
    }

    public int getGolsVisitant() {
        return golsVisitant;
    }

    public void setGolsVisitant(int golsVisitant) {
        this.golsVisitant = golsVisitant;
    }

    public int getResultatsLocal() {
        return resultatsLocal;
    }

    public void setResultatsLocal(int resultatsLocal) {
        this.resultatsLocal = resultatsLocal;
    }

    public int getResultatsVisitant() {
        return resultatsVisitant;
    }

    public void setResultatsVisitant(int resultatsVisitant) {
        this.resultatsVisitant = resultatsVisitant;
    }
    
}
