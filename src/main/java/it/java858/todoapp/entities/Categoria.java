/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe che rappresenta una categoria
 *
 * @author Matteo Demarchi
 */
@Entity
public class Categoria implements Serializable {

    // <editor-fold defaultstate="collapsed" desc="Campi e Getters/Setters">
    /*
     Id della categoria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Id (chiave primaria)
     *
     * @return id
     */
    public long getId() {
        return id;
    }

    /*
     Nome della categoria
     */
    private String nome;

    /**
     * Categoria
     *
     * @return Il nome della categoria
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta la categoria
     *
     * @param nome Il nome della categoria
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    // </editor-fold>
}
