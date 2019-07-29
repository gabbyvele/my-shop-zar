package com.myitzar.persistence.util;

import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Produces;

/**
 * Created by Gabby on 2018/07/08.
 */
@ApplicationScoped
public class Resource {

    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    @Produces
    public EntityManager getEntityManager(){
        return em;
    }
}
