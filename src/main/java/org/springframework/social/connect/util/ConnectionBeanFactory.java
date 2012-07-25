package org.springframework.social.connect.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.showcase.youtube.model.repository.UsersConnectionRepository;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 2:22 PM
 */
public class ConnectionBeanFactory {

    @Autowired
    private UsersConnectionRepository usersConnectionRepository;

    @Autowired
    private ConnectionRepository connectionRepository;

    public <T> T  getConnection(Class<T> connectionClass) throws IllegalAccessException, InstantiationException {
        Connection<T> connection = connectionRepository.findPrimaryConnection(connectionClass);
        return connection != null ? connection.getApi() : connectionClass.newInstance();
    }

    public ConnectionRepository getConnectionRepository(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    }
}
