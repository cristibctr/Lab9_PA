/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristi.lab9_pa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


/**
 *
 * @author crist
 */
public class Base {
    static EntityManagerFactory emf;
    EntityManager em;
    
    @BeforeAll
    public static void beforeAll(){
        emf = Persistence.createEntityManagerFactory("lab9");
    }
    
    @AfterAll
    public static void afterAll(){
        emf.close();
    }
    
    @BeforeEach
    public void beforeEach(){
        em = emf.createEntityManager();
    }
    
    @AfterEach
    public void afterEach(){
        em.close();
    }
}
