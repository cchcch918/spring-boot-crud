package com.assignment.springbootcrud.dao.generic;

import java.io.Serializable;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.security.access.method.P;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.assignment.springbootcrud.util.ClassUtil;

@Transactional(propagation = Propagation.MANDATORY)
public abstract class GenericDaoImpl<T, ID extends Serializable> implements GenericDao<T, ID> {

    @Inject
    private SessionFactory sessionFactory;

    protected final Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    private final Class<P> bean;

    @SuppressWarnings("unchecked")
    protected GenericDaoImpl() {
        bean = (Class<P>) ClassUtil.getTypeArguments(GenericDaoImpl.class, this.getClass()).get(0);
    }

    @Override
    public Serializable add(final T entity) {
        return getSession().save(entity);
    }

    @Override
    public void delete(final T entity) {
        getSession().delete(entity);
        getSession().flush();
    }

    @Override
    public void delete(final ID id) {
        final Session s = this.getSession();
        s.delete(s.load(bean, id));
        s.flush();
    }

    @Override
    public void update(final T entity) {
        getSession().merge(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(final ID id) {
        if (id == null) {
            return null;
        }
        return (T) getSession().get(bean, id);
    }

}