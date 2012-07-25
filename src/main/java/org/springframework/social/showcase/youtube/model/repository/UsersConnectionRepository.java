package org.springframework.social.showcase.youtube.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.social.showcase.youtube.model.entity.UserConnection;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 3:52 PM
 */
public interface UsersConnectionRepository extends UsersConnectionRepositoryCustom, JpaRepository<Long, UserConnection> {


}
