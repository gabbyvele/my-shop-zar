package com.myitzar.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gabby on 2018/07/08.
 */
public class DataRepositoryImpl<T> implements DataRepository<T> {

    @PersistenceContext(unitName = "primary")
    private EntityManager em;

    @Override
    public List<T> retrieveAllEntities(Class<T> clazz) {
        try {
            String queryString = "from " + clazz.getName() + " t";

            TypedQuery<T> query = em.createQuery(queryString, clazz);

            return query.getResultList();
        } catch (NoResultException nre){
            return Collections.emptyList();
        }
    }
}
