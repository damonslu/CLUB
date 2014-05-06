/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ModAgent.services;

//import com.ModAgent.application.exceptions.UniversityNotFoundException;
import java.util.List;

/**
 *
 * @author boniface
 * @param <T>
 * @param <ID>
 */
public interface Service<T, ID> {

    public T find(ID id);

    public void persist(T entity);

    public void merge(T entity);

    public void remove(T entity);

    public List<T> findAll();

    public List<T> findInRange(int firstResult, int maxResults);

    public long count();

    //public T getByPropertyName(String propertyName, String propertyValue) throws UniversityNotFoundException;

    public List<T> getEntitiesByProperName(String propertyName, String propertyValue);
}
