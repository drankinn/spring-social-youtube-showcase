package org.springframework.social.showcase.youtube.model.repository.impl;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.showcase.youtube.model.entity.UserConnection;
import org.springframework.social.showcase.youtube.model.repository.UsersConnectionRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Set;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 3:55 PM
 */
public class UsersConnectionRepositoryImpl implements UsersConnectionRepository, UsersConnectionRepositoryCustom {

    @PersistenceUnit
    EntityManager entityManager;

    @Override
    public List<String> findUserIdsWithConnection(Connection<?> connection) {
        ConnectionKey key = connection.getKey();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(UserConnection.class);
        Root<UserConnection> root = query.from(UserConnection.class);
        Predicate providerIdPredicate = builder.equal(root.get("providerId"), key.getProviderId());
        Predicate providerIdUserPredicate = builder.equal(root.get("providerUserId"), key.getProviderUserId());
        query.where(providerIdPredicate, providerIdUserPredicate);
        return entityManager.createQuery(query.select(root.get("userId"))).getResultList();
    }

    @Override
    public Set<String> findUserIdsConnectedTo(String providerId, Set<String> providerUserIds) {
        return null;
    }

    @Override
    public ConnectionRepository createConnectionRepository(String userId) {
        return null;
    }
}
