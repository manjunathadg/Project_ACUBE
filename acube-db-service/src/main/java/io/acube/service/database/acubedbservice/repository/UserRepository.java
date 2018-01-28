/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Repository Interface with the dynamic method to be executed
*/
package io.acube.service.database.acubedbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.acube.service.database.acubedbservice.model.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByUserName(String username);

}
