package org.springframework.social.showcase.youtube.model.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;

import java.util.List;
import java.util.Set;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 3:57 PM
 */
@NoRepositoryBean
public interface UsersConnectionRepositoryCustom {


    List<String> findUserIdsWithConnection(Connection<?> connection);

    Set<String> findUserIdsConnectedTo(String providerId, Set<String> providerUserIds);

    ConnectionRepository createConnectionRepository(String userId);
}
