package com.github.binodnme;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Pratish Shrestha <pratishshrestha@lftechnology.com>
 */
public class Resources {
    @Produces
    @PersistenceContext
    private EntityManager em;

}