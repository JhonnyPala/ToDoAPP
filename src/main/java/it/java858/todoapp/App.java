/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp;

import it.java858.todoapp.services.DBService;
import it.java858.todoapp.entities.ToDo;
import it.java858.todoapp.services.ToDoServices;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe main
 *
 * @author Matteo Demarchi
 */
public class App {

    /*
     I due oggetti da usare per interfacciarsi col database e le unità persisteni
     (tutto cioò che è il mondo jpa) sono EntityManager, figlio di EntityManagerFactory:
     da qui si può incominciare a lavorare
     VEDI CLASSE DBService
     */
    private static EntityManager em;

    /**
     * Main dell'applicazione
     *
     * @param args
     */
    public static void main(String[] args) {

        /*
         Aggiunta riga
         <provider>org.eclipse.persistence.jpa.PersistenceProvider</provider>
         nel file Persistence
         */
        /*
         Riferimento alla classe EntityManager
         */
        em = DBService.getEntityManager();

        /*
         Creo un nuovo ToDo
         */
        ToDo td = new ToDo();
        td.setTesto("Tra poco caffè");
        td.setDataCreazione(new Date());

        /*
         Salvo l'oggetto sfruttando i metodi della classe ToDoServices
         */
        ToDoServices.save(td);
    }
}
