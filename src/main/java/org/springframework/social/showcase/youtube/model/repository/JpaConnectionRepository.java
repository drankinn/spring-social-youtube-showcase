package org.springframework.social.showcase.youtube.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.social.showcase.youtube.model.entity.UserConnection;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 4:41 PM
 */
public interface JpaConnectionRepository extends ConnectionRepositoryCustom,  JpaRepository<Long, UserConnection> {
}
