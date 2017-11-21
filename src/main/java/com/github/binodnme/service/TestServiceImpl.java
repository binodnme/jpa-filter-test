package com.github.binodnme.service;

import com.github.binodnme.entity.User;
import com.github.binodnme.filters.QueryBuilder;
import com.github.binodnme.pojo.FilterUnit;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/22/2016.
 */
public class TestServiceImpl implements TestService {

    @Inject
    private EntityManager entityManager;

    @Override
    public List<User> testMethod() {

        QueryBuilder queryBuilder = new QueryBuilder(entityManager);

        List<FilterUnit> filterUnits = Arrays.asList(
                new FilterUnit("firstName", "eq", "binod"));

//        TypedQuery<User> query = queryBuilder.build(filterUnits, User.class);

//        return query.getResultList();

        return queryBuilder.getResultSet(filterUnits, User.class);
    }
}
