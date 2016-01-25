/**
 *
 */
package io.yope.repository;

import org.springframework.security.core.userdetails.User;

/**
 * @author massi
 *
 */
public interface UserRepository {

    User createUser(User user);

    User getUser(String username);

    User deleteUser(String username);

}
