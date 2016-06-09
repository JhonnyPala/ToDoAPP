/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.services;

/**
 * Classe che offre emtodi utili per lavorare con gli oggetti ToDo rispetto al
 * database
 *
 * @author Matteo Demarchi
 */
import it.java858.todoapp.entities.ToDo;
import javax.persistence.EntityManager;

public class ToDoServices {

    // <editor-fold defaultstate="collapsed" desc="Costruttori">
    private ToDoServices() {

    }
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Metodi">
    /**
     * Aggiorna/Salva l'oggetto ToDo passato
     *
     * @param toSave Oggetto ToDo da aggiornare/salvare
     * @return Restituisce lo stesso oggetto ToDo ma aggiornato
     */
    public static ToDo save(ToDo toSave) {

        EntityManager em = DBService.getEntityManager();

        /*
         Rendo persistente la modifica
         */
        em.getTransaction().begin();
        em.persist(toSave);
        em.getTransaction().commit();

        //Chiudo la connessione
        //em.close();
        return toSave;
    }
// </editor-fold>
}
