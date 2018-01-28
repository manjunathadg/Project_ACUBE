/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Model Class mapped to the database table
*/
package io.acube.service.database.acubedbservice.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data @NoArgsConstructor
public class User {
	
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "country_code")
	private String country_code;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "profile_pic")
	private String profile_pic;

	@Column(name = "gender")
	private int gender;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "email")
	private String email;

	@Column(name = "created_by")
	private String created_by;

	@Column(name = "created_on")
	private Date created_on;

	@Column(name = "modified_by")
	private String modified_by;

	@Column(name = "modified_on")
	private Date modified_on;

	@Column(name = "deleted_by")
	private String deleted_by;

	@Column(name = "deleted_on")
	private Date deleted_on;

	@Column(name = "is_deleted")
	private int is_deleted;
	
	public User(User user) {
		this.id = user.id;
		this.userName = user.userName;
		this.password = user.password;
		this.first_name = user.first_name;
		this.last_name = user.last_name;
		this.country_code = user.country_code;
		this.mobile = user.mobile;
		this.profile_pic = user.profile_pic;
		this.gender = user.gender;
		this.dob = user.dob;
		this.email = user.email;
		this.created_by = user.created_by;
		this.modified_by = user.modified_by;
		this.modified_on = user.modified_on;
		this.deleted_by = user.deleted_by;
		this.deleted_on = user.deleted_on;
		this.is_deleted = user.is_deleted;
	}

	public String getPassword() {
		return this.password;
	}

}
