package com.myitzar.persistence.dao;

import java.util.List;

/**
 * Created by Gabby on 2018/07/08.
 */
public interface DataRepository<T> {

    List<T> retrieveAllEntities(Class<T> clazz);

}
