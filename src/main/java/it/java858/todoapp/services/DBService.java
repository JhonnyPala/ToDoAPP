/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe per interagire col database tramite EntityManager:
 *
 *  * @author Matteo Demarchi
 */
public class DBService {

    // <editor-fold defaultstate="collapsed" desc="Campi e Getters/Setters">
    private static EntityManagerFactory emf;
    private static EntityManager em;

    /**
     * L'EntityManager da utilizzare
     *
     * @return L'istanza di em creata
     */
    public static EntityManager getEntityManager() {
        if (em != null && em.isOpen()) {
            return em;
        } else {
            return null;
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Costruttori">
    /**
     * Costruttore statico
     */
    static {
        emf = Persistence.createEntityManagerFactory("pu");
        em = emf.createEntityManager();
    }

    /**
     * Costruttore privato, classe astratta
     */
    private DBService() {

    }
// </editor-fold>

}
