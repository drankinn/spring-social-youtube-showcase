package org.springframework.social.connect.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: lancea10
 * Date: 8/13/12
 * Time: 6:26 PM
 */
@Service("connectionRepository")
@Scope(value="request", proxyMode = ScopedProxyMode.INTERFACES)
public class ConnectionRepositoryService implements ConnectionRepository, UsersConnectionRepository {


    private String userId;

    @Resource
    private UsersConnectionRepository repository;

    @PostConstruct
    public  void init(){
        this.userId = SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @Override
    public MultiValueMap<String, Connection<?>> findAllConnections() {
        return null;
    }

    @Override
    public List<Connection<?>> findConnections(String providerId) {
        return new ArrayList<Connection<?>>();
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
        if(true){
            String s = "";
        }
    }

    @Override
    public void updateConnection(Connection<?> connection) {
        if(true){
            String s = "";
        }
    }

    @Override
    public void removeConnections(String providerId) {
        if(true){
            String s = "";
        }
    }

    @Override
    public void removeConnection(ConnectionKey connectionKey) {
        if(true){
            String s = "";
        }
    }

    @Override
    public List<String> findUserIdsWithConnection(Connection<?> connection) {
        return null;
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
