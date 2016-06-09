/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.entities;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe che rappresenta un ToDo, una sorta di PostIt
 *
 * @author Matteo Demarchi
 */
@Entity
public class ToDo implements Serializable {

    // <editor-fold defaultstate="collapsed" desc="Campi e Getters/Setters">
    /*
     Id del ToDo
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
     Testo del ToDo
     */
    private String testo;

    /**
     * Messaggio
     *
     * @return Il testo del messaggio
     */
    public String getTesto() {
        return testo;
    }

    /**
     * Imposta il testo del messaggio
     *
     * @param testo Il nuovo testo del messaggio
     */
    public void setTesto(String testo) {
        this.testo = testo;
    }

    /*
     Data di creazione del ToDo
     */
    @Temporal(TemporalType.DATE)
    private Date dataCreazione;

    /**
     * Data creazione
     *
     * @return La data di creazione del ToDo
     */
    public Date getDataCreazione() {
        return dataCreazione;
    }

    /**
     * Imposta la data di creazione del ToDo
     *
     * @param dataCreazione La data di creazione del ToDo
     */
    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    /*
     Lista di categorie
     */
    @ManyToMany
    private Set<Categoria> categorie;

    /**
     * Categorie del ToDo
     *
     * @return La lista di oggetti categoria
     */
    public Set<Categoria> getCategorie() {
        return categorie;
    }

    /**
     * Imposta la categorie del ToDo
     *
     * @param categorie La lista di oggetti categoria
     */
    public void setCategorie(Set<Categoria> categorie) {
        this.categorie = categorie;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="hashCode & equals">
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ToDo other = (ToDo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    // </editor-fold>
}
