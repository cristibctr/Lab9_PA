/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristi.lab9_pa;

import DAO.JPA.Movie;
import java.awt.EventQueue;

/**
 *
 * @author crist
 */
public class Main {
    public static void main(String[] args){
        Base newBase;
        Movie myMovies = new Movie();
        myMovies.create("The Godfather");
        myMovies.create("Pulp Fiction");
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Chart.createAndShowGUI();
            }
        });
    }
}
