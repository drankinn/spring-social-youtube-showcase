package org.springframework.social.showcase.youtube.model.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.util.MultiValueMap;

import java.util.List;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 4:43 PM
 */
@NoRepositoryBean
public interface JpaConnectionRepositoryCustom {

    MultiValueMap<String, Connection<?>> findAllConnections();


    List<Connection<?>> findConnections(String providerId);


    <A> List<Connection<A>> findConnections(Class<A> apiType);


    MultiValueMap<String, Connection<?>> findConnectionsToUsers(MultiValueMap<String, String> providerUserIds);


    Connection<?> getConnection(ConnectionKey connectionKey);


    <A> Connection<A> getConnection(Class<A> apiType, String providerUserId);


    <A> Connection<A> getPrimaryConnection(Class<A> apiType);


    <A> Connection<A> findPrimaryConnection(Class<A> apiType);


    void addConnection(Connection<?> connection);


    void updateConnection(Connection<?> connection);


    void removeConnections(String providerId);


    void removeConnection(ConnectionKey connectionKey);

}
