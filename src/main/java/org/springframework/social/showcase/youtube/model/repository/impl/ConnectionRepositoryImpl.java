package org.springframework.social.showcase.youtube.model.repository.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.showcase.youtube.model.repository.ConnectionRepositoryCustom;
import org.springframework.util.MultiValueMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.List;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 4:44 PM
 */
public class ConnectionRepositoryImpl implements ConnectionRepositoryCustom, ConnectionRepository {

    @PersistenceUnit
    EntityManager entityManager;

    @Override
    public MultiValueMap<String, Connection<?>> findAllConnections() {

        /*********** we shouldn't be requiring spring security in a JPA Repository ***************/
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userId = authentication.getName();
        /****************************************************************************************/

        Query query = entityManager.createNativeQuery(selectFromUserConnection() + " where userId = ? order by providerId, rank");
        query.setParameter(1, userId);
        query.getResultList();
        return null;
    }

    @Override
    public List<Connection<?>> findConnections(String providerId) {
        return null;
    }

    @Override
    public <A> List<Connection<A>> findConnections(Class<A> apiType) {
        return null;
    }

    @Override
    public MultiValueMap<String, Connection<?>> findConnectionsToUsers(MultiValueMap<String, String> providerUserIds) {
        return null;
    }

    @Override
    public Connection<?> getConnection(ConnectionKey connectionKey) {
        return null;
    }

    @Override
    public <A> Connection<A> getConnection(Class<A> apiType, String providerUserId) {
        return null;
    }

    @Override
    public <A> Connection<A> getPrimaryConnection(Class<A> apiType) {
        return null;
    }

    @Override
    public <A> Connection<A> findPrimaryConnection(Class<A> apiType) {
        return null;
    }

    @Override
    public void addConnection(Connection<?> connection) {
    }

    @Override
    public void updateConnection(Connection<?> connection) {
    }

    @Override
    public void removeConnections(String providerId) {
    }

    @Override
    public void removeConnection(ConnectionKey connectionKey) {
    }

    // internal helpers
    private String selectFromUserConnection() {
        return "select userId, providerId, providerUserId, displayName, profileUrl, imageUrl, accessToken, secret, refreshToken, expireTime from " + "UserConnection";
    }
}
