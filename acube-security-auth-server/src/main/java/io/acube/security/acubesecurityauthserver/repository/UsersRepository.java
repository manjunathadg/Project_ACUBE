/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Interface that provides dynamic findBy method
*/
package io.acube.security.acubesecurityauthserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.acube.security.acubesecurityauthserver.model.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

	Optional<Users> findByusername(String username);

}
